package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var username2: EditText
    lateinit var email2: EditText
    lateinit var password2: EditText
    lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username2 = findViewById(R.id.theusername)
        email2 = findViewById(R.id.theemail)
        password2 = findViewById(R.id.thepassword)
        button2 = findViewById(R.id.thebutton)


        button2.setOnClickListener(){
            var user2 = username2.text.toString()
            var pass2 = password2.text.toString()
            if (user2.isEmpty() || pass2.isEmpty()){
                Toast.makeText(this, "required fields", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "entered username is $user2 and entered password is $pass2 ", Toast.LENGTH_SHORT).show()

            }

        }

    }
}