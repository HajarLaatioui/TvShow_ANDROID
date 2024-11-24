package com.esiea.tvshow.showDetails.domain.model

import com.esiea.tvshow.showDetails.data.dto.EpisodeDto
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class TvShow(
    val country: String,
    val description: String,
    val genres: List<String>,
    val id: Int,
    val imagePath: String,
    val name: String,
    val pictures: List<String>,
    val rating: String,
    val ratingCount: String,
    val runtime: Int,
    val startDate: String,
    val status: String,
) : Serializable
