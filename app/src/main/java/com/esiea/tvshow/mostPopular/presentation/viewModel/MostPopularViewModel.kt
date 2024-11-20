package com.esiea.tvshow.mostPopular.presentation.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.esiea.tvshow.mostPopular.domain.useCases.MostPopularUseCases
import com.esiea.tvshow.mostPopular.domain.useCases.Resource
import com.esiea.tvshow.mostPopular.presentation.mostPopularState.MostPopularState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MostPopularViewModel  @Inject constructor(
     private val mostPopularUseCases: MostPopularUseCases
) : ViewModel() {

    private val _mostPopularState = mutableStateOf(MostPopularState())
    var mostPopularState: State<MostPopularState> = _mostPopularState

    init {
        getMostPopular()
    }

    private fun getMostPopular() = viewModelScope.launch(Dispatchers.IO) {

        mostPopularUseCases.invoke().onEach {
            when(it){
                is Resource.Error -> {
                    _mostPopularState.value = MostPopularState(error = "Unexpected error occurred")
                }
                is Resource.Loading -> {
                    _mostPopularState.value = MostPopularState(isLoading = true)
                }
                is Resource.Success -> {
                    _mostPopularState.value = MostPopularState( mostPopular = it.data ?: emptyList())
                }

            }
        }.launchIn(viewModelScope)
    }

}