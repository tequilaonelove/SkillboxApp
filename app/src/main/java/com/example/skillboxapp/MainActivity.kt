package com.example.skillboxapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.firstButton).setOnClick()
        findViewById<Button>(R.id.secondButton).setOnClick()
        findViewById<Button>(R.id.thirdButton).setOnClick()

    }

    private fun Button.setOnClick() {
        this.setOnClickListener {
            Log.i(TAG, this.text.toString())
        }
    }
}