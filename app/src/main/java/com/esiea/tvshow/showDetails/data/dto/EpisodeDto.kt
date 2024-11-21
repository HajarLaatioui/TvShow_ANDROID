package com.esiea.tvshow.showDetails.data.dto

import com.esiea.tvshow.showDetails.domain.model.Episode
import com.google.gson.annotations.SerializedName

data class EpisodeDto(
    @SerializedName("season")
    val season: Int,
    @SerializedName("episode")
    val episode: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("air_date")
    val air_date: String
)


fun EpisodeDto.toEpisode(): Episode {
    return Episode(
        season = this.season,
        episode = this.episode,
        name = this.name,
        air_date = this.air_date
    )
}
