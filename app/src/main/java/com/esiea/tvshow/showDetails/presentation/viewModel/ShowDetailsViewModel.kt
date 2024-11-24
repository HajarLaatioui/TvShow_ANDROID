package com.esiea.tvshow.showDetails.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.esiea.tvshow.showDetails.domain.useCases.GetShowDetailsUseCase
import com.esiea.tvshow.showDetails.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ShowDetailsViewModel @Inject constructor(
    private val getShowDetailsUseCase: GetShowDetailsUseCase
) : ViewModel() {

    private val _state : MutableStateFlow<ShowDetailsState> = MutableStateFlow(ShowDetailsState())
    val state: StateFlow<ShowDetailsState> = _state

    fun fetchShowDetails(showId: Int) = viewModelScope.launch(Dispatchers.IO) {
            getShowDetailsUseCase(showId).collectLatest { result ->
                when (result) {

                    is Resource.Loading -> {
                        _state.value = ShowDetailsState(isLoading = true)
                    }
                    is Resource.Success -> {
                        _state.value = ShowDetailsState(tvShow = result.data)
                    }
                    is Resource.Error -> {
                        _state.value = ShowDetailsState(
                            error = result.message ?: "An unknown error occurred",
                            isLoading = false
                        )
                    }
                }
            }
        }
    }

