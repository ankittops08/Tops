package com.example.text

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {


    lateinit var t1 : TextView
    lateinit var t2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var i = intent
        t2 = findViewById(R.id.t2)

        t2.setText(i.getStringExtra("number"))



    }
}