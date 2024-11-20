package com.esiea.tvshow.mostPopular.data.dto


import com.esiea.tvshow.mostPopular.domain.model.MostPopular
import com.google.gson.annotations.SerializedName

data class MostPopularDto(
    @SerializedName("country")
    val country: String,
    @SerializedName("end_date")
    val endDate: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image_thumbnail_path")
    val imageThumbnailPath: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("start_date")
    val startDate: String,
    @SerializedName("status")
    val status: String
)

 fun MostPopularDto.toMostPopular(): MostPopular{
     return MostPopular(
         country = country,
         endDate = endDate,
         id = id,
         imageThumbnailPath = imageThumbnailPath,
         name = name,
         startDate = startDate,
         status = status
     )
 }