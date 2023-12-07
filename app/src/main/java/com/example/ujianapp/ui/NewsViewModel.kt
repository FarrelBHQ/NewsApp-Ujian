package com.example.ujianapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.ujianapp.data.model.NewsResponse
import com.example.ujianapp.data.repository.NewsRepository

class NewsViewModel (private val repository: NewsRepository) : ViewModel() {

    val antaraNewestNews: LiveData<NewsResponse> = repository.antaraNewestNews
    val antaraSportsNews: LiveData<NewsResponse> = repository.antaraSportsNews
    val antaraLyfestyleNews: LiveData<NewsResponse> = repository.antaraLifestyleNews

    val cnbcNewestNews: LiveData<NewsResponse> = repository.cnbcNewestNews
    val cnbcEntrepreneurNews: LiveData<NewsResponse> = repository.cnbcEntrepreneurNews
    val cnbcSyariahNews: LiveData<NewsResponse> = repository.cnbcSyariahNews

    val cnnNewestNews: LiveData<NewsResponse> = repository.cnnNewestNews
    val cnnTechnologyNews: LiveData<NewsResponse> = repository.cnnTechnologyNews
    val cnnEntertainmentNews: LiveData<NewsResponse> = repository.cnnEntertainmentNews

    fun getAntaraNewestNews() {
        repository.getAntaraNewestNews()
    }
    fun getAntaraSportsNews() {
        repository.getAntaraSportsNews()
    }
    fun getAntaraLifestyleNews() {
        repository.getAntaraLifestyleNews()
    }
    fun getCnbcNewestNews() {
        repository.getCnbcNewestNews()
    }
    fun getCnbcEntrepreneurNews() {
        repository.getCnbcEntrepreneurNews()
    }
    fun getCnbcSyariahNews() {
        repository.getCnbcSyariahNews()
    }
    fun getCnnNewestNews() {
        repository.getCnnNewestNews()
    }
    fun getCnnTechnologyNews() {
        repository.getCnnTechnologyNews()
    }
    fun getCnnEntertainmentNews() {
        repository.getCnnEntertainmentNews()
    }


}
