package com.example.transferscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var b3: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1 =  findViewById(R.id.b1)
        b2 =  findViewById(R.id.b2)
        b3 =  findViewById(R.id.b3)


        b1.setOnClickListener {

            var i = Intent(this,MainActivity2::class.java)
            startActivity(i)

        }
        b2.setOnClickListener {

            var i= Intent(this,MainActivity3::class.java)
            startActivity(i)

        }

        b3.setOnClickListener {

            var i = Intent(this,MainActivity4::class.java)
            startActivity(i)
        }
    }





}
