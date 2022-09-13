package com.example.wtmfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.example.wtmfirstapp.adapter.MainPageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout:TabLayout
    private lateinit var viewPager:ViewPager2
    private lateinit var toolbar:androidx.appcompat.widget.Toolbar//responsible for the swiping action

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar=findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)



        //initializes the tab layout
        initTabLayout()
    }

    private fun initTabLayout() {
        //responsible for the tabs
        tabLayout = findViewById(R.id.tab)

        //responsible for the swiping action
        viewPager = findViewById(R.id.viewPager)

        //To access the FragmentManger and the property which is supportFragmentManager of an activity and lifecycle,
        // then pass it to the Mainpageadapter and pass it to the FragmentStateAdapter constructor which is the super class
        viewPager.adapter = MainPageAdapter(supportFragmentManager, lifecycle)

        //connecting tabLayout and viewpager,it will provide reference & position of the tab,
        //then we can specify the tab and position
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            //when any position btw 0 and 3 is clicked, it will show the following
            when (position) {
                0 -> tab.icon = getDrawable(R.drawable.ic_baseline_camera_enhance_24)
                1 -> tab.text = "Chats"
                2 -> tab.text = "Status"
                3 -> tab.text = "Calls"
                else -> tab.text = "Chat"
            }
        }.attach() //this enable the headings(TabLayout name) to show
        viewPager.currentItem = 1//this enables the default tab-layout to be chats tab
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item:MenuItem):Boolean {
        when (item.itemId) {
            R.id.app_bar_search -> {
                Toast.makeText(this, "Search Icon was clicked", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.secret_group -> {
                Toast.makeText(this, "A new secret group has been created", Toast.LENGTH_LONG).show()
                return true
            }

            R.id.Linked_devices -> {
                Toast.makeText(this, "Link your device now", Toast.LENGTH_LONG).show()
                return true
            }

            R.id.new_group -> {
                goToNewGroupActivity()

               Toast.makeText(this, "New group created", Toast.LENGTH_LONG).show()
                return true

            }
            R.id.New_broadcast -> {

                goToBroadcastActivity()
                Toast.makeText(this, "New broadcast list created", Toast.LENGTH_LONG).show()
                return true
            }

            R.id.Starred_messages -> {

                Toast.makeText(this, "Starred Messages are here", Toast.LENGTH_LONG).show()
                return true
            }

            R.id.Settings -> {

                Toast.makeText(this, "Settings are here", Toast.LENGTH_LONG).show()
                return true
            }
            else -> {
                return false
            }

        }
    }
    // To navigate from main_activity to new_activity to the other
    private fun goToNewGroupActivity(){
                //this activity to the activity you want.
        var i = Intent(this, NewGroupActivity::class.java)
        startActivity(i) // Navigate to the new group activity page
    }

    private fun goToBroadcastActivity(){
        //this activity to the activity you want.
        var j = Intent(this, BroadcastActivity::class.java)
        startActivity(j) // Navigate to the new group activity page
    }


} //Hardtoguess1$


