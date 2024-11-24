package com.esiea.tvshow.showDetails.presentation.viewmodel

import com.esiea.tvshow.showDetails.domain.model.ShowDetailsResponse
import com.esiea.tvshow.showDetails.domain.model.TvShow

data class ShowDetailsState(
    val isLoading: Boolean = false,
    val tvShow: TvShow? = null,
    val error: String = ""
)
