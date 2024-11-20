package com.esiea.tvshow.mostPopular.data.dto


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