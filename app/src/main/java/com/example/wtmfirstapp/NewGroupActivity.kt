package com.example.wtmfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class NewGroupActivity : AppCompatActivity() {

    private lateinit var recycler: RecyclerView.Recycler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_group)
    }
    //recycleView = findViewById()

}