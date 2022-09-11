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
import com.example.wtmfirstapp.SampleData

// this is to create a list of the friends and how many times it should occur or appear using
// the recyclerview(list) done in the New group layout(drawing) in the listoffriends class
class ListOfFriendsAdapter(val context:Context):RecyclerView.Adapter<ListOfFriendsAdapter.LFViewHolder>(){
    private val sampleData = SampleData() // sampledata object created for a sample of list of friends
    private val ListOfFriends = sampleData.LIST_OF_FRIENDS // accesing the LIST_OF_FRIENDS in the  SampleData object
                                                           //superior abstract class of recyclerView

    // connecting the itemview with the username and status layout interface
    class LFViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val userName:TextView =itemView.findViewById(R.id.userName)// This connects TextView with id userName in the interface in the list of friends layout
        val status:TextView =itemView.findViewById(R.id.status) // This connects TextView with id status interface layout in the list of friends layout
    }


    //this connects the list of friends layout interface to the activity and inflates itg
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LFViewHolder {
        val itemView=LayoutInflater.from(context).inflate(R.layout.list_of_friends_layout, parent, false)
        return LFViewHolder(itemView) //allows the access to the list of friends layout

    }

    override fun onBindViewHolder(holder: LFViewHolder, position: Int) {

        //this loops through the listoffriends names in the sampleData created and its can be accessed as inputting the name of the list and the index(position)
        // ,the holder is reference to the class created which are userName and status in USER class
        holder.userName.text= ListOfFriends[position].userName
        holder.status.text=ListOfFriends[position].status

        holder.itemView.setOnClickListener{
            val Intent = Intent(context, ChatActivity::class.java)
            context.startActivity(Intent)
        }
    }

    // This shows the number of item in the sample data class created
    override fun getItemCount(): Int {
       return ListOfFriends.size
    }
}