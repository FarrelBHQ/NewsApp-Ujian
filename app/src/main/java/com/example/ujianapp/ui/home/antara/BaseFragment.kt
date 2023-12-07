package com.example.ujianapp.ui.home.antara

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.ujianapp.adapter.viewpager.AntaraSectionPagerAdapter
import com.example.ujianapp.databinding.FragmentBaseBinding
import com.google.android.material.tabs.TabLayoutMediator

class BaseFragment : Fragment() {

    private lateinit var binding: FragmentBaseBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBaseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewPager()
    }

    private fun setUpViewPager() {
        val adapter = AntaraSectionPagerAdapter(requireActivity() as AppCompatActivity)
        binding.vpNewsAntara.adapter = adapter
        val tabList = arrayOf(
            "Newest",
            "Sports",
            "Lifestyle"
        )
        TabLayoutMediator(binding.tabsAntara, binding.vpNewsAntara){tab, page ->
            tab.text = tabList[page]
        }.attach()

    }
}