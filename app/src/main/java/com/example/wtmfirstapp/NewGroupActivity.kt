package com.example.wtmfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wtmfirstapp.adapter.ListOfFriendsAdapter

class NewGroupActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    private lateinit var recyclerView: RecyclerView

    private lateinit var recycler: RecyclerView.Recycler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_group)


        toolbar = findViewById(R.id.toolbar)
        //setSupportActionBar(toolbar)
        //supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //Set up recyclerview and show it on screen
        recyclerView = findViewById(R.id.list_of_friends)
        recyclerView.adapter = ListOfFriendsAdapter(this) // setting an adapter to the recycler view
        recyclerView.layoutManager = LinearLayoutManager(this) //setting to display the recycler view

        //adding line decoration
        val decor = DividerItemDecoration(this, RecyclerView.VERTICAL)
        recyclerView.addItemDecoration(decor)

    }

//    private fun gotoChatActivity(){
//        var k = Intent(this,ChatActivity::class.java)
//        startActivity(k)
//    }


}