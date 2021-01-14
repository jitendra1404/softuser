package com.example.softuser

import Fragments.AboutUsFragment
import Fragments.AddStudentFragment
import Fragments.HomeFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {

    private lateinit var btnHome:Button
    private lateinit var btnAddStudent:Button
    private lateinit var btnAboutUs: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btnHome=findViewById(R.id.btnHome)
        btnAddStudent=findViewById(R.id.btnAddStudent)
        btnAboutUs=findViewById(R.id.btnAboutUs)

        btnHome.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.linearcontainer, HomeFragment())
                addToBackStack(null)
                commit()
            }
        }

        btnAddStudent.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.linearcontainer, AddStudentFragment())
                addToBackStack(null)
                commit()
            }
        }

        btnAboutUs.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.linearcontainer, AboutUsFragment())
                addToBackStack(null)
                commit()
            }
        }


    }
}