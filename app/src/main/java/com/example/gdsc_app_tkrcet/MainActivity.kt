package com.example.gdsc_app_tkrcet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button:Button=findViewById(R.id.button)
        var button2:Button=findViewById(R.id.button2)
        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()
        button.setOnClickListener {
            intent= Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            intent= Intent(applicationContext,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}