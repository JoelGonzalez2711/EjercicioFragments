package com.example.ejerciciofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = PrimerFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout,firstFragment)
                .commit()
        }
    }
}