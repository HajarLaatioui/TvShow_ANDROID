package com.esiea.tvshow.mostPopular.domain.model

import com.esiea.tvshow.mostPopular.data.dto.MostPopularDto

data class MostPopularResponse(
    val page: Int,
    val pages: Int,
    val total: String,
    val tvShows: List<MostPopularDto>
)
