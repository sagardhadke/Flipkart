package com.example.flipkartonlineshopping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Language : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        supportActionBar?.title = "Choose Language"
    }
}