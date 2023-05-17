package com.example.chatapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val r = Runnable { // if you are redirecting from a fragment
            // then use getActivity() as the context.
            val intent= Intent(this,Login::class.java)
            startActivity(intent)

        }

        Handler(Looper.getMainLooper()).postDelayed({
            // Your Coder
                             r.run()
        }, 3000)


    }
}