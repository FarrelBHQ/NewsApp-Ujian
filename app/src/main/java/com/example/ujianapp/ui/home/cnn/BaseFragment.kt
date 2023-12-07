package com.example.ujianapp.ui.home.cnn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.ujianapp.adapter.viewpager.CnbcSectionPagerAdapter
import com.example.ujianapp.databinding.FragmentBase3Binding
import com.google.android.material.tabs.TabLayoutMediator


class BaseFragment : Fragment() {

    private lateinit var binding: FragmentBase3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBase3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewPager()
    }

    private fun setUpViewPager() {
        val adapter = CnbcSectionPagerAdapter(requireActivity() as AppCompatActivity)
        binding.vpNewsCnn.adapter = adapter
        val tabList = arrayOf(
            "Newest",
            "Technology",
            "Amusement"
        )
        TabLayoutMediator(binding.tabsCnn, binding.vpNewsCnn){tab, page ->
            tab.text =tabList[page]
        }.attach()

    }

}