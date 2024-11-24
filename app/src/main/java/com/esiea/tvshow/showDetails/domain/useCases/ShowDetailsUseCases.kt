package com.esiea.tvshow.showDetails.domain.useCases

import android.util.Log
import com.esiea.tvshow.showDetails.data.dto.toShowDetailsResponse
import com.esiea.tvshow.showDetails.domain.model.ShowDetailsResponse
import com.esiea.tvshow.showDetails.domain.model.TvShow
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
    operator fun invoke(showId: Int): Flow<Resource<TvShow>> = flow {
        try {
            emit(Resource.Loading())
            val showDetails : TvShow = repository.getShowDetails(showId = showId).toShowDetailsResponse().tvShow
            Log.d("ShowDetailsUseCase", "invoke: $showDetails")
            emit(Resource.Success(showDetails))
        } catch (e: IOException) {
            emit(Resource.Error<TvShow>("Could not load data"))
        } catch (e: HttpException) {
            emit(Resource.Error<TvShow>("Internet Error"))
        } finally {
            emit(Resource.Loading<TvShow>(false))
        }
    }
}
