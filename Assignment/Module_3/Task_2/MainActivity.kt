package com.example.colourchange

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextClock
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var b1 : Button
    lateinit var  b2 : Button
    lateinit var r1 : RelativeLayout
    lateinit var  t1 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1=findViewById(R.id.b1)
        b2=findViewById(R.id.b2)
        r1=findViewById(R.id.r1)
        t1=findViewById(R.id.t1)

        b1.setOnClickListener {
            r1.setBackgroundColor(Color.parseColor("#FF000000"))
            t1.setTextColor(Color.parseColor("#FFFFFFFF")
            )
        }
        b2.setOnClickListener {
            r1.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
            t1.setTextColor(Color.parseColor("#FF000000"))

        }



    }
}