package com.example.wtmfirstapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wtmfirstapp.ChatActivity
import com.example.wtmfirstapp.R
import com.example.wtmfirstapp.SampleMessages
import com.example.wtmfirstapp.model.Message

class ListOfMessagesAdapter(val context: Context):RecyclerView.Adapter<ListOfMessagesAdapter.MsgViewHolder>() {

    private var sampleMessage = SampleMessages()
    private var listofmessages:List<Message> = sampleMessage.LIST_OF_MESSAGES
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MsgViewHolder {

        val itemView:View = LayoutInflater.from(context).inflate(R.layout.list_of_friends_layout, parent, false)

        return MsgViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MsgViewHolder, position: Int) {
        holder.userName.text =listofmessages[position].userName
        holder.message.text =listofmessages[position].message

        //to connect,each item which is the itemView in the recyclerview of the list of friends layout to the ChatActivity
        //and it will enable the user to navigate from any of the message clicked to the ChatActivity Layout.
        holder.itemView.setOnClickListener{
            val intent = Intent(context, ChatActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listofmessages.size
    }

    class MsgViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val userName:TextView =itemView.findViewById(R.id.userName)
        val message:TextView=itemView.findViewById(R.id.status)

    }
}