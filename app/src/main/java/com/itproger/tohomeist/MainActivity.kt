package com.itproger.tohomeist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itproger.tohomeist.home_screen.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView,HomeFragment())

    }
}