package com.example.ujianapp.ui.home.antara

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ujianapp.adapter.news.NewsAdapter
import com.example.ujianapp.data.repository.NewsRepository
import com.example.ujianapp.databinding.FragmentAntaraNewestBinding
import com.example.ujianapp.ui.NewsViewModel
import com.example.ujianapp.utils.NewsViewModelFactory

class NewestFragment : Fragment() {

    private lateinit var binding: FragmentAntaraNewestBinding
    private val newestViewModel: NewsViewModel by viewModels{
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAntaraNewestBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nAdapter = NewsAdapter()

        newestViewModel.getAntaraNewestNews()

        newestViewModel.antaraNewestNews.observe(viewLifecycleOwner) {
            nAdapter.setData(it.data!!)
            binding.rvAntaraNewestNews.apply {
                adapter = nAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }
        }
    }

}