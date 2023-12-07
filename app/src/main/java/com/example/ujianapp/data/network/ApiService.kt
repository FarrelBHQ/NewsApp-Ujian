package com.example.ujianapp.data.network

import com.example.ujianapp.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("antara/terbaru/")
    fun getAntaraNewestNews(
    ): Call<NewsResponse>

    @GET("/antara/olahraga")
    fun getAntaraSportsNews(
    ): Call<NewsResponse>


    @GET("/antara/lifeStyle")
    fun getAntaraLifestyleNews(
    ): Call<NewsResponse>

    @GET("/cnbc/terbaru")
    fun getCnbcNewestNews(
    ): Call<NewsResponse>

    @GET("/cnbc/entrepreneur")
    fun getCnbcEntrepreneurNews(
    ): Call<NewsResponse>


    @GET("/cnbc/syariah")
    fun getCnbcSyariahNews(
    ): Call<NewsResponse>

    @GET("/cnn/terbaru")
    fun getCnnNewestNews(
    ): Call<NewsResponse>

    @GET("/cnn/teknologi")
    fun getCnnTechnologyNews(
    ): Call<NewsResponse>


    @GET("/cnn/hiburan")
    fun getCnnEntertainmentNews(
    ): Call<NewsResponse>


}
