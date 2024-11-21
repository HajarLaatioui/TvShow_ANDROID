package com.esiea.tvshow.showDetails.domain.useCases

import com.esiea.tvshow.showDetails.data.dto.toShowDetails
import com.esiea.tvshow.showDetails.domain.model.ShowDetails
import com.esiea.tvshow.showDetails.domain.repository.ShowDetailsRepository
import com.esiea.tvshow.showDetails.domain.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetShowDetailsUseCase @Inject constructor(
    private val repository: ShowDetailsRepository
) {
    operator fun invoke(showId: Int): Flow<Resource<ShowDetails>> = flow {
        try {
            emit(Resource.Loading<ShowDetails>(true))

            val response = repository.getShowDetails(showId)

            val showDetails = response.toShowDetails()

            emit(Resource.Success(showDetails))
        } catch (e: IOException) {
            emit(Resource.Error<ShowDetails>("Could not load data"))
        } catch (e: HttpException) {
            emit(Resource.Error<ShowDetails>("Internet Error"))
        } finally {
            emit(Resource.Loading<ShowDetails>(false))
        }
    }
}
