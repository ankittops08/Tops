package com.example.text

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var b1 : Button
    lateinit var e1 : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1 = findViewById(R.id.b1)
        e1 = findViewById(R.id.e1)



        b1.setOnClickListener {
            var num= e1.text.toString()
            if (num.equals(0)   )
            {
                Toast.makeText(this,"enter number",Toast.LENGTH_LONG )
            }
            else
            {
                var i = Intent(this,MainActivity2::class.java)
                i.putExtra("number",num.toString())
                startActivity(i)
            }



        }



    }
}