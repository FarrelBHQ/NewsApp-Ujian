package com.example.ujianapp.data.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

object ApiClient {
    private val BASE_URL = "https://api-berita-indonesia.vercel.app/"

    fun provideApiService() : ApiService {
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor { chain->
                val newRequest = chain.request().newBuilder()
                    .build()
                chain.proceed(newRequest)
            }
            .readTimeout(10, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .build()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(ApiService::class.java)

    }
}