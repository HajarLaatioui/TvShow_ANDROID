package com.esiea.tvshow.showDetails.data.dto


import com.esiea.tvshow.showDetails.domain.model.ShowDetailsResponse
import com.google.gson.annotations.SerializedName

data class ShowDetailsResponseDto(
    @SerializedName("tvShow")
    val tvShow: TvShowDto
)


fun ShowDetailsResponseDto.toShowDetailsResponse(): ShowDetailsResponse {
    return ShowDetailsResponse(
        tvShow = tvShow.toTvShow()
    )
}

