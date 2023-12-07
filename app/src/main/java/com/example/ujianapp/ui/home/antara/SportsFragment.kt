package com.example.ujianapp.ui.home.antara

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ujianapp.R
import com.example.ujianapp.adapter.news.NewsAdapter
import com.example.ujianapp.data.repository.NewsRepository
import com.example.ujianapp.databinding.FragmentAntaraSportsBinding
import com.example.ujianapp.ui.NewsViewModel
import com.example.ujianapp.utils.NewsViewModelFactory

class SportsFragment : Fragment() {

    private lateinit var binding: FragmentAntaraSportsBinding
    private val sportsViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAntaraSportsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nAdapter = NewsAdapter()

        sportsViewModel.getAntaraSportsNews()

        sportsViewModel.antaraSportsNews.observe(viewLifecycleOwner) {
            nAdapter.setData(it.data!!)
            binding.rvAntaraSportsNews.apply {
                adapter = nAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }
        }
    }
}