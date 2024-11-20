package com.esiea.tvshow.di

import com.esiea.tvshow.mostPopular.data.repository.MostPopularRepositoryImpl
import com.esiea.tvshow.mostPopular.data.service.ApiConstant
import com.esiea.tvshow.mostPopular.data.service.MostPopularApiService
import com.esiea.tvshow.mostPopular.domain.repository.MostPopularRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MostPopularModule {
    @Provides
    @Singleton
    fun provideNewsApiService(): MostPopularApiService {
        return Retrofit.Builder()
            .baseUrl(ApiConstant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MostPopularApiService::class.java)
    }


    @Provides
    @Singleton
    fun provideMostPopularRepository(apiService: MostPopularApiService): MostPopularRepository {
        return MostPopularRepositoryImpl(apiService)
    }



}