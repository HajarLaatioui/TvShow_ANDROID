package com.esiea.tvshow.mostPopular.data.service

import com.esiea.tvshow.mostPopular.data.dto.MostPopularResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface MostPopularApiService {
    @GET(ApiConstant.MOSTPOPULAR)
    suspend fun getMostPopular(
        @Query("page") page: String = ApiConstant.PAGE
    ): MostPopularResponseDto

}