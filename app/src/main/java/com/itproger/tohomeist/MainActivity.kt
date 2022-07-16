package com.itproger.tohomeist

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itproger.tohomeist.data.cards.api.CardApp
import com.itproger.tohomeist.databinding.ActivityMainBinding
import com.itproger.tohomeist.home.HomeFragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, HomeFragment())

    }




}
