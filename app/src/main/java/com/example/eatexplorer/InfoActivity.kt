package com.example.eatexplorer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InfoActivity : AppCompatActivity() {
    private lateinit var text : TextView
    private lateinit var info : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        text = findViewById(R.id.textView5)

        if (intent.hasExtra("infoname")) {
            info = intent.getStringExtra("infoname")!!
        }

        if(info.equals("contact")) {
            text.setText("info@eatexplorer.com , + 90 539 971 45 20")
        }
        if (info.equals("about")) {
            text.setText("Who are we?\n" +
                    "Hello! We are the developers of this application, which we call \"Taste Map\". Our mission is to discover the unique food culture in different cities of Turkey and to offer these delicacies to our users.\n" +
                    "The \"Taste Map\" is a guide for anyone who wants to discover which foods are famous in cities all over Turkey. \n" +
                    "Our goal is to provide a platform for exploring the gastronomic richness of preserving and spreading the local food culture. We want to equip food lovers with interesting information about the origin and preparation of each flavor and invite them to explore one of the cultural mosaics of Turkey."
            )
        }
    }
}