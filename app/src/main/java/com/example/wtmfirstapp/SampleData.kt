package com.example.wtmfirstapp

import com.example.wtmfirstapp.model.Message
import com.example.wtmfirstapp.model.User

class SampleData {
    //Using the User Class object created initially to create the data sample class here.
    //using LIST_OF_FRIENDS in uppercase making it accessible across all files the connecting it to the listoffriendsAdapter
    var LIST_OF_FRIENDS:List<User> = listOf(
        User("Vikky","Hey dear am using sneakchat"),
        User("Jenny","I love coding a lot"),
        User("Bandana","I dey come"),
        User("Victoria","sneakchat sneakchat"),
        User("VANCER","Hey dear am using sneakchat"),
        User("RUTH OKENIYI","This is my style")



    )
}

class SampleMessages{
    var LIST_OF_MESSAGES:List<Message> = listOf(
        Message("ESTHER", "17:00", "How are you today ?"),
        Message("Deborah","17:01","Bring my book please"),
        Message("Seboreah","17:01","Bring my book please"),
        Message("david","17:01","i dont like you at all"),
        Message("Chisom","17:01","I like you"),
        Message("Riches","17:01","Bring my book please"),
        Message("Deborah","17:01","I LOVE YOU BABE"),
        Message("david","17:01","My name is David BabyGirl"),
        Message("Chisom","17:01","Bring my book please"),
        Message("Riches","17:01","Bring my book please"),
        Message("Deborah","17:01","Bring my book please"),
        Message("david","17:01","Bring my book please"),
        Message("Chisom","17:01","Bring my book please"),
        Message("Riches","17:01","Bring my book please"),
        Message("Deborah","17:01","Bring my book please"),
        Message("david","17:01","Bring my book please"),
        Message("Chisom","17:01","Bring my book please"),
        Message("Riches","17:01","Bring my book please"),
        Message("Deborah","17:01","Bring my book please"),

    )
}