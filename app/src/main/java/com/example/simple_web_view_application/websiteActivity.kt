package com.example.simple_web_view_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class websiteActivity : AppCompatActivity() {

    private lateinit var myWeb: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)

        myWeb = findViewById(R.id.mweb)

        val webSettings = myWeb.settings
        webSettings.javaScriptEnabled = true
        myWeb.loadUrl("https://kcb.com")



    }
}