package com.example.wtmfirstapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wtmfirstapp.R
import com.example.wtmfirstapp.SampleMessages
import com.example.wtmfirstapp.model.Message

class ListOfMessagesAdapter(val context: Context):RecyclerView.Adapter<ListOfMessagesAdapter.MsgViewHolder>() {

    private var sampleMessage = SampleMessages()
    private var listofmessages:List<Message> = sampleMessage.LIST_OF_MESSAGES
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MsgViewHolder {

        val itemView:View = LayoutInflater.from(context).inflate(R.layout.activity_list_of_chats, parent, false)

        return MsgViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MsgViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return listofmessages.size
    }

    class MsgViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

    }
}