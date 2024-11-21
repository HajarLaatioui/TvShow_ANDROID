package com.esiea.tvshow.showDetails.data.repository

import com.esiea.tvshow.showDetails.data.dto.ShowDetailsResponseDto
import com.esiea.tvshow.showDetails.data.service.ShowDetailsApiService
import com.esiea.tvshow.showDetails.domain.repository.ShowDetailsRepository
import javax.inject.Inject

class ShowDetailsRepositoryImpl @Inject constructor(
    private val showDetailsApiService: ShowDetailsApiService
) : ShowDetailsRepository {
    override suspend fun getShowDetails(showId: Int): ShowDetailsResponseDto {
        return showDetailsApiService.getShowDetails(showId)
    }
}
