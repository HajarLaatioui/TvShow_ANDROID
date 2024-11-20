package com.esiea.tvshow.mostPopular.data.dto


import com.esiea.tvshow.mostPopular.domain.model.MostPopularResponse
import com.google.gson.annotations.SerializedName

data class MostPopularResponseDto(
    @SerializedName("page")
    val page: Int,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("total")
    val total: String,
    @SerializedName("tv_shows")
    val tvShows: List<MostPopularDto>
)

fun MostPopularResponseDto.toMostPopularResponse(): MostPopularResponse {
    return MostPopularResponse(
        page = page,
        pages = pages,
        total = total,
        tvShows = tvShows
    )
}