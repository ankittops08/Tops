package com.example.cricket

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity2 : AppCompatActivity() {

    lateinit var img : ImageView
    lateinit var txt : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        img = findViewById(R.id.i1)
        img.setOnClickListener {
            Toast.makeText(this, "Max Score is 700", Toast.LENGTH_SHORT).show()
        }

        img = findViewById(R.id.i2)
        img.setOnClickListener {
            Toast.makeText(this, "Max Score is 600", Toast.LENGTH_SHORT).show()
        }

        img = findViewById(R.id.i3)
        img.setOnClickListener {
            Toast.makeText(this, "Max Score is 500", Toast.LENGTH_SHORT).show()
        }

        img = findViewById(R.id.i4)
        img.setOnClickListener {
            Toast.makeText(this, "Max Score is 400", Toast.LENGTH_SHORT).show()
        }

        txt = findViewById(R.id.t2)
        txt.setOnClickListener {
            var url = "https://www.bcci.tv/"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }

        txt = findViewById(R.id.t3)
        txt.setOnClickListener {
            var url = "http://www.tigercricket.com.bd/"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }

        txt = findViewById(R.id.t4)
        txt.setOnClickListener {
            var url = "https://cricket.af/"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }

        txt = findViewById(R.id.t5)
        txt.setOnClickListener {
            var url = "https://www.hkcricket.org/"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }

    }
}