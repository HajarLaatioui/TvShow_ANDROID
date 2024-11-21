package com.esiea.tvshow.showDetails.presentation.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.esiea.tvshow.showDetails.domain.model.ShowDetails
import com.esiea.tvshow.showDetails.domain.useCases.GetShowDetailsUseCase
import com.esiea.tvshow.showDetails.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ShowDetailsViewModel @Inject constructor(
    private val getShowDetailsUseCase: GetShowDetailsUseCase
) : ViewModel() {

    private val _state = mutableStateOf(ShowDetailsState())
    val state: State<ShowDetailsState> = _state

    fun fetchShowDetails(showId: Int) {
        viewModelScope.launch {
            getShowDetailsUseCase(showId).collect { result ->
                when (result) {
                    is Resource.Loading -> {
                        _state.value = _state.value.copy(isLoading = result.isLoading)
                    }
                    is Resource.Success -> {
                        _state.value = _state.value.copy(showDetails = result.data, isLoading = false)
                    }
                    is Resource.Error -> {
                        _state.value = _state.value.copy(
                            error = result.message ?: "An unknown error occurred",
                            isLoading = false
                        )
                    }
                }
            }
        }
    }
}
