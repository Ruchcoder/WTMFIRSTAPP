package com.example.wtmfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView

class ChatActivity : AppCompatActivity() {
    private lateinit var toolbar:Toolbar
    private lateinit var messageRV: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        messageRV = findViewById(R.id.message_section)

        toolbar= findViewById(R.id.toolbar)//connects the toolbar to the ChatActivity
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Username"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}