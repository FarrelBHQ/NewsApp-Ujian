package com.example.ujianapp.adapter.viewpager

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ujianapp.ui.home.antara.LifestyleFragment
import com.example.ujianapp.ui.home.antara.NewestFragment
import com.example.ujianapp.ui.home.antara.SportsFragment

class AntaraSectionPagerAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        var fragment : Fragment? = null
        fragment = when(position){
            0-> NewestFragment()
            1-> SportsFragment()
            2-> LifestyleFragment()
            else-> NewestFragment()
        }
        return fragment
    }

}