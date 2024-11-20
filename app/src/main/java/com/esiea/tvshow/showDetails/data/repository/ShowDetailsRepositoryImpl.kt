package com.formation.mynews.getNews.data.remote.repository


import com.esiea.tvshow.showDetails.data.dto.ShowDetailsDto
import com.esiea.tvshow.showDetails.domain.repository.ShowDetailsRepository
import com.esiea.tvshow.showDetails.data.service.ShowDetailsApiService
import javax.inject.Inject

class ShowDetailsRepositoryImpl @Inject constructor (
    private val showDetailsApiService: ShowDetailsApiService
) : ShowDetailsRepository {
    override suspend fun getShowDetails(showId: Int): ShowDetailsDto =
        showDetailsApiService.getShowDetails(showId)
    }
