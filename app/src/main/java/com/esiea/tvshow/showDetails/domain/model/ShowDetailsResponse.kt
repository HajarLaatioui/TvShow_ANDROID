package com.esiea.tvshow.showDetails.domain.model

import com.esiea.tvshow.showDetails.data.dto.TvShowDto
import java.io.Serializable

data class ShowDetailsResponse(
    val tvShow: TvShow

) : Serializable
