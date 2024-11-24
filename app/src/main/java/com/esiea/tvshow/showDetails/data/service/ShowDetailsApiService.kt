package com.esiea.tvshow.showDetails.data.service

import com.esiea.tvshow.showDetails.data.dto.ShowDetailsResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ShowDetailsApiService {
    @GET("show-details")
    suspend fun getShowDetails(
        @Query("q") showId: Int
    ): ShowDetailsResponseDto
}
