package com.example.ujianapp.ui.home.cnbc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.ujianapp.adapter.viewpager.CnbcSectionPagerAdapter
import com.example.ujianapp.databinding.FragmentBase2Binding
import com.google.android.material.tabs.TabLayoutMediator


class BaseFragment : Fragment() {

    private lateinit var binding: FragmentBase2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBase2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewPager()
    }

    private fun setUpViewPager() {
        val adapter = CnbcSectionPagerAdapter(requireActivity() as AppCompatActivity)
        binding.vpNewsCnbc.adapter = adapter
        val tabList = arrayOf(
            "Newest",
            "Entrepreneur",
            "Syariah"
        )
        TabLayoutMediator(binding.tabsCnbc, binding.vpNewsCnbc){tab, page ->
            tab.text = tabList[page]
        }.attach()

    }

}