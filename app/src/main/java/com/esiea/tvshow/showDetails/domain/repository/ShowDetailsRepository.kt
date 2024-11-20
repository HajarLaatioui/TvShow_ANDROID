package com.esiea.tvshow.showDetails.domain.repository

import com.esiea.tvshow.showDetails.data.dto.ShowDetailsDto


interface ShowDetailsRepository {
    suspend fun getShowDetails(showId: Int) : ShowDetailsDto
    }
