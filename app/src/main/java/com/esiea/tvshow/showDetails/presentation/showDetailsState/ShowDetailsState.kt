package com.esiea.tvshow.showDetails.presentation.viewmodel

import com.esiea.tvshow.showDetails.domain.model.ShowDetails

data class ShowDetailsState(
    val isLoading: Boolean = false,
    val showDetails: ShowDetails? = null,
    val error: String = ""
)
