package com.esiea.tvshow.showDetails.data.dto

import com.google.gson.annotations.SerializedName

data class EpisodeDto(
    @SerializedName("air_date")
    val air_date: String,
    @SerializedName("episode")
    val episode: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("season")
    val season: Int
)
