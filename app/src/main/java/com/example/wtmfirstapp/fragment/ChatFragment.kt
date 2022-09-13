package com.example.wtmfirstapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wtmfirstapp.adapter.ListOfFriendsAdapter
import com.example.wtmfirstapp.R
import com.example.wtmfirstapp.adapter.ListOfMessagesAdapter


class ChatFragment : Fragment() {

    private lateinit var chatRecyclerView: RecyclerView



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    //view reference the chat layout
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        chatRecyclerView = view.findViewById(R.id.chatrecycler)

        //connects the ListOfFriendsAdapter in place of ListOfChatAdapter now to the chatfragment
        //(requireContext()) is used in place of (this) because the fragment isnt on an activity because
        //context is a superclass of an activity,
        chatRecyclerView.adapter = ListOfMessagesAdapter(requireContext())
        chatRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        //chatRecyclerView.addItemDecoration(DividerItemDecoration(requireContext(), RecyclerView.VERTICAL))

    }


}