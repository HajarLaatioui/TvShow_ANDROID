package com.esiea.tvshow.showDetails.domain.repository

import com.esiea.tvshow.showDetails.data.dto.ShowDetailsResponseDto

interface ShowDetailsRepository {
    suspend fun getShowDetails(showId: Int): ShowDetailsResponseDto
}
