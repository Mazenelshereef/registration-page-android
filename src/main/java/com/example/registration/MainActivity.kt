package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.have as have1

class MainActivity : AppCompatActivity() {
    lateinit var username1: EditText
    lateinit var email1: EditText
    lateinit var password1: EditText
    lateinit var button1: Button
    lateinit var have1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            username1 = findViewById(R.id.theusername)
            email1 = findViewById(R.id.theemail)
            password1 = findViewById(R.id.thepassword)
            button1 = findViewById(R.id.thebutton)
            have1 = findViewById(R.id.have)


        button1.setOnClickListener(){
            var user = username1.text.toString()
            var pass = password1.text.toString()
            var eml = email1.text.toString()
            if (user.isEmpty() || pass.isEmpty() || eml.isEmpty()){
                Toast.makeText(this, "required fields", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "entered username is $user and entered email is $eml and entered password is $pass ", Toast.LENGTH_SHORT).show()
                val intents = Intent(this, MainActivity3::class.java)
                startActivity(intents)
            }

        }
        have1.setOnClickListener(){
           val intentss = Intent(this, MainActivity2::class.java)
            startActivity(intentss)
        }

    }
}