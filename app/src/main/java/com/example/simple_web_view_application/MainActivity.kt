package com.example.simple_web_view_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var kcb:Button
    private lateinit var equity:Button
    private lateinit var absa:Button
    private lateinit var cop:Button
    private lateinit var nbk:Button
    private lateinit var post:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kcb = findViewById(R.id.btnkcb)
        equity = findViewById(R.id.btnequity)
        absa = findViewById(R.id.btnabsa)
        cop = findViewById(R.id.btncop)
        nbk = findViewById(R.id.btnnbk)
        post = findViewById(R.id.btnpost)


        kcb.setOnClickListener {

            val gotowebsite = Intent(this, websiteActivity::class.java)
            startActivity(gotowebsite)
        }

        absa.setOnClickListener {

            val gotowebsite = Intent(this,websiteActivity::class.java)
            startActivity(gotowebsite)
        }
    }
}