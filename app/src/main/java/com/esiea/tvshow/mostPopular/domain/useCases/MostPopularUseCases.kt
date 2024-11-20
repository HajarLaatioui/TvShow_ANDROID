package com.esiea.tvshow.mostPopular.domain.useCases

import com.esiea.tvshow.mostPopular.data.dto.toMostPopular
import com.esiea.tvshow.mostPopular.data.dto.toMostPopularResponse
import com.esiea.tvshow.mostPopular.domain.model.MostPopular
import com.esiea.tvshow.mostPopular.domain.repository.MostPopularRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class MostPopularUseCases @Inject constructor(
    private val newsRepository: MostPopularRepository

) {
    suspend operator fun  invoke(): Flow<Resource<List<MostPopular>>> = flow {

        try {
            emit(Resource.Loading<List<MostPopular>>(isLoading = true))

            val articles: List<MostPopular> = newsRepository.getMostPopular().toMostPopularResponse().tvShows.map {
                    mostPopular ->  mostPopular.toMostPopular()
            }

            emit(Resource.Success<List<MostPopular>>(articles))
        }catch ( e: IOException){
            emit(Resource.Error<List<MostPopular>>(message = "Could not load data"))
        } catch (
            e : HttpException
        ){
            emit(Resource.Error<List<MostPopular>>(message = "Internet Error"))
        }
    }
}