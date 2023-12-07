package com.example.ujianapp.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.ujianapp.data.model.NewsResponse
import com.example.ujianapp.data.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsRepository {

    private val _antaraNewestNews = MutableLiveData<NewsResponse>()
    val antaraNewestNews:LiveData<NewsResponse> = _antaraNewestNews

    private val _antaraSportsNews = MutableLiveData<NewsResponse>()
    val antaraSportsNews:LiveData<NewsResponse> = _antaraSportsNews

    private val _antaraLifestyleNews = MutableLiveData<NewsResponse>()
    val antaraLifestyleNews:LiveData<NewsResponse> = _antaraLifestyleNews

    private val _cnbcNewestNews = MutableLiveData<NewsResponse>()
    val cnbcNewestNews:LiveData<NewsResponse> = _cnbcNewestNews

    private val _cnbcEntrepreneurNews = MutableLiveData<NewsResponse>()
    val cnbcEntrepreneurNews:LiveData<NewsResponse> = _cnbcEntrepreneurNews

    private val _cnbcSyariahNews = MutableLiveData<NewsResponse>()
    val cnbcSyariahNews:LiveData<NewsResponse> = _cnbcSyariahNews

    private val _cnnNewestNews = MutableLiveData<NewsResponse>()
    val cnnNewestNews:LiveData<NewsResponse> = _cnnNewestNews

    private val _cnnTechnologyNews = MutableLiveData<NewsResponse>()
    val cnnTechnologyNews:LiveData<NewsResponse> = _cnnTechnologyNews

    private val _cnnEntertainmentNews = MutableLiveData<NewsResponse>()
    val cnnEntertainmentNews:LiveData<NewsResponse> = _cnnEntertainmentNews

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    fun getAntaraNewestNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getAntaraNewestNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _antaraNewestNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }
            })

    }

    fun getAntaraSportsNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getAntaraSportsNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _antaraSportsNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }
            })

    }

    fun getAntaraLifestyleNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getAntaraLifestyleNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _antaraLifestyleNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }
            })

    }

    fun getCnbcNewestNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getCnbcNewestNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnbcNewestNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }
            })

    }

    fun getCnbcEntrepreneurNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getCnbcEntrepreneurNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnbcEntrepreneurNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }
            })

    }

    fun getCnbcSyariahNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getCnbcSyariahNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnbcSyariahNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }
            })

    }

    fun getCnnNewestNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getCnnNewestNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnnNewestNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }
            })

    }

    fun getCnnTechnologyNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getCnnTechnologyNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnnTechnologyNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }
            })

    }

    fun getCnnEntertainmentNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getCnnEntertainmentNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnnEntertainmentNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code"
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure" + t.localizedMessage
                    )
                }
            })

    }







}