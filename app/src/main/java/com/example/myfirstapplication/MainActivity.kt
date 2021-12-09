package com.example.myfirstapplication

import android.content.Intent
import android.media.MediaCodec
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.card.MaterialCardView
import java.security.Key
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationBar: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationBar = findViewById(R.id.bottom_navigation_bar)

        bottomNavigationBar.setOnNavigationItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.fragment_1 -> {
                    fragment = FirstFragment()
                }
                R.id.fragment_2 -> {
                    fragment = SecondFragment()
                }
            }
            replaceFragment(fragment!!)

            true
        }
        bottomNavigationBar.selectedItemId=R.id.fragment_1
    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(fragment.tag)
            .replace(R.id.fragment_container, fragment)
            .commit()
    }


}
