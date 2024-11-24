package com.esiea.tvshow.showDetails.data.dto


import com.esiea.tvshow.showDetails.domain.model.Episode
import com.google.gson.annotations.SerializedName

data class EpisodeDto(
    @SerializedName("air_date")
    val airDate: String,
    @SerializedName("episode")
    val episode: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("season")
    val season: Int
)

fun EpisodeDto.toEpisode(): Episode {
    return Episode(
        air_date = airDate,
        episode =  episode,
        name = name,
        season = season
    )
}