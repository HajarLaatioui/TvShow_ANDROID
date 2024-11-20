package com.esiea.tvshow.mostPopular.domain.repository

import com.esiea.tvshow.mostPopular.data.dto.MostPopularResponseDto

interface MostPopularRepository {
    suspend fun getMostPopular(): MostPopularResponseDto
}