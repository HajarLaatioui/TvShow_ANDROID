package com.esiea.tvshow.mostPopular.data.repository

import com.esiea.tvshow.mostPopular.data.dto.MostPopularResponseDto
import com.esiea.tvshow.mostPopular.data.service.MostPopularApiService
import com.esiea.tvshow.mostPopular.domain.repository.MostPopularRepository
import javax.inject.Inject

class MostPopularRepositoryImpl @Inject constructor(
       private  val mostPopularApiService:MostPopularApiService
) : MostPopularRepository {
       override  suspend fun  getMostPopular(): MostPopularResponseDto {
              return mostPopularApiService.getMostPopular()
       }
}

