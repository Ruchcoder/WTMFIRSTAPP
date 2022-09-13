package com.example.wtmfirstapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.wtmfirstapp.fragment.CallFragment
import com.example.wtmfirstapp.fragment.CameraFragment
import com.example.wtmfirstapp.fragment.ChatFragment
import com.example.wtmfirstapp.fragment.StatusFragment

//this syn the tab and viewpager together, activity is the parent of FragmentManger,
// fragment manager manage fragment that are showing in activity appropriately according to set of phone.
class MainPageAdapter(fm:FragmentManager, lf:Lifecycle):FragmentStateAdapter(fm,lf) {
    override fun getItemCount(): Int {
        return 4 //numbers of fragment on the mainactivity page

    }
    override fun createFragment(position: Int): Fragment {
        return  when(position){
            0-> CameraFragment()
            1-> ChatFragment()
            2-> StatusFragment()
            3-> CallFragment()
            else-> ChatFragment()

        }
    }
}
