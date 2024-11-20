package com.esiea.tvshow.mostPopular.domain.model

import java.io.Serializable

data class MostPopular(
    val country: String,
    val endDate: String,
    val id: Int,
    val imageThumbnailPath: String,
    val name: String,
    val startDate: String,
    val status: String
) : Serializable
