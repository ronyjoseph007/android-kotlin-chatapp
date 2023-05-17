package com.example.chatapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {

    private lateinit var editEmail:EditText
    private lateinit var editPassword:EditText
    private lateinit var signUp:Button
    private lateinit var login:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editEmail=findViewById(R.id.edit_email)
        editPassword=findViewById(R.id.edit_password)
        signUp=findViewById(R.id.btn_signup)
        login=findViewById(R.id.login)

        signUp.setOnClickListener{

            val intent= Intent(this,Signup::class.java)
            startActivity(intent)


        }


    }
}