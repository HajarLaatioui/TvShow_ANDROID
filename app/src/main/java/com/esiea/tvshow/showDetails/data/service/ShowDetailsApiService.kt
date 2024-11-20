package com.esiea.tvshow.showDetails.data.service


import com.esiea.tvshow.showDetails.data.dto.ShowDetailsDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ShowDetailsApiService {
    @GET(ApiConstant.SHOWDETAILS)
    suspend fun getShowDetails(
        @Query(ApiConstant.SHOW_ID) showId: Int
    ): ShowDetailsDto
}
