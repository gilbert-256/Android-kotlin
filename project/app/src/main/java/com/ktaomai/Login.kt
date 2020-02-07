package com.ktaomai

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class Login: AppCompatActivity() {

    private lateinit var rellay1: RelativeLayout
    private lateinit var rellay2: RelativeLayout
    private var handler = Handler()
    private var runnable: Runnable = Runnable {
        // Splash and Login Screen
        rellay1.visibility = View.VISIBLE
        rellay2.visibility = View.VISIBLE
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        rellay1 = findViewById<View>(R.id.relativelayout1) as RelativeLayout
        rellay2 = findViewById<View>(R.id.relativelayout2) as RelativeLayout

        // It display the splash screen for 4 secs before it shows the login screen
        handler.postDelayed(runnable, 4000)

        //Switch to the next activity
        btnSignUp.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        }
    }

