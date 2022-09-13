package com.example.cricket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button

class MainActivity() : AppCompatActivity() {

    lateinit var b1 :Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1 = findViewById(R.id.click_here)
        b1.setOnClickListener {
            var i1 = Intent(this,MainActivity2::class.java)
            startActivity(i1)

        }

    }

}