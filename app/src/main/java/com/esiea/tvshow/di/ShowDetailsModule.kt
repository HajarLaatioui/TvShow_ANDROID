package com.esiea.tvshow.di

import com.esiea.tvshow.mostPopular.data.repository.MostPopularRepositoryImpl
import com.esiea.tvshow.mostPopular.data.service.ApiConstant
import com.esiea.tvshow.mostPopular.data.service.MostPopularApiService
import com.esiea.tvshow.mostPopular.domain.repository.MostPopularRepository
import com.esiea.tvshow.showDetails.data.repository.ShowDetailsRepositoryImpl
import com.esiea.tvshow.showDetails.data.service.ShowDetailsApiService
import com.esiea.tvshow.showDetails.domain.repository.ShowDetailsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ShowDetailsModule {
    @Provides
    @Singleton
    fun provideShowDetailsApiService(): ShowDetailsApiService {
        return Retrofit.Builder()
            .baseUrl(ApiConstant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ShowDetailsApiService::class.java)
    }


    @Provides
    @Singleton
    fun provideShowDetailsRepository(apiService: ShowDetailsApiService): ShowDetailsRepository {
        return ShowDetailsRepositoryImpl(apiService)
    }


}