package com.esiea.tvshow.mostPopular.presentation.mostPopularState

import com.esiea.tvshow.mostPopular.domain.model.MostPopular

class MostPopularState {
    val isLoading: Boolean = false
    val mostPopular: List<MostPopular> = emptyList()
    val error: String = ""
}