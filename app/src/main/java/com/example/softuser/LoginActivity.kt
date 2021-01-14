package com.example.softuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private lateinit var edUserName: EditText
    private lateinit var edPassword: EditText
    private lateinit var btnLogin: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edUserName = findViewById(R.id.edUserName)
        edPassword = findViewById(R.id.edPassword)
        btnLogin = findViewById(R.id.btnLogin)


        btnLogin.setOnClickListener {

            var status = if (edUserName.text.toString() == ("softwarica") || edPassword.text.toString() == ("coventry")) {

                "login successful"
            } else {
                " login fail"
            }

            Toast.makeText(this, status, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

    }
}


