package com.example.wtmfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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


}


