package com.example.ujianapp.ui.home.cnbc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ujianapp.R
import com.example.ujianapp.adapter.news.NewsAdapter
import com.example.ujianapp.data.repository.NewsRepository
import com.example.ujianapp.databinding.FragmentAntaraNewestBinding
import com.example.ujianapp.databinding.FragmentCnbcSyariahBinding
import com.example.ujianapp.ui.NewsViewModel
import com.example.ujianapp.utils.NewsViewModelFactory

class SyariahFragment : Fragment() {

    private lateinit var binding: FragmentCnbcSyariahBinding
    private val syariahViewModel: NewsViewModel by viewModels{
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCnbcSyariahBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nAdapter = NewsAdapter()

        syariahViewModel.getCnbcSyariahNews()

        syariahViewModel.cnbcSyariahNews.observe(viewLifecycleOwner) {
            nAdapter.setData(it.data!!)
            binding.rvCnbcSyariahNews.apply {
                adapter = nAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }
        }
    }

}