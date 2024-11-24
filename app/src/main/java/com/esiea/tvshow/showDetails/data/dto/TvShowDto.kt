package com.esiea.tvshow.showDetails.data.dto


import com.esiea.tvshow.showDetails.domain.model.TvShow
import com.google.gson.annotations.SerializedName

data class TvShowDto(
    @SerializedName("country")
    val country: String,
    @SerializedName("description")
    val description: String,
//    @SerializedName("episodes")
//    val episodes: List<EpisodeDto>,
    @SerializedName("genres")
    val genres: List<String>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image_path")
    val imagePath: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("pictures")
    val pictures: List<String>,
    @SerializedName("rating")
    val rating: String,
    @SerializedName("rating_count")
    val ratingCount: String,
    @SerializedName("runtime")
    val runtime: Int,
    @SerializedName("start_date")
    val startDate: String,
    @SerializedName("status")
    val status: String,

)

 fun TvShowDto.toTvShow() : TvShow {
     return TvShow(
         country = country,
         description = description,
         genres = genres,
         id = id ,
         imagePath = imagePath ,
         name = name ,
         pictures = pictures ,
         rating = rating ,
         ratingCount = ratingCount ,
         runtime = runtime,
         startDate = startDate,
         status  = status
     )
 }