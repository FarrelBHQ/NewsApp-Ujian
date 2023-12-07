package com.example.ujianapp.adapter.viewpager

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ujianapp.ui.home.cnn.EntertainmentFragment
import com.example.ujianapp.ui.home.cnn.NewestFragment
import com.example.ujianapp.ui.home.cnn.TechnologyFragment


class CnnSectionPagerAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        var fragment : Fragment? = null
        fragment = when(position){
            0-> NewestFragment()
            1-> TechnologyFragment()
            2-> EntertainmentFragment()
            else-> NewestFragment()
        }
        return fragment
    }

}