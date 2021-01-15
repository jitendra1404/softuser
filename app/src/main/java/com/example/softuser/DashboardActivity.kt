package com.example.softuser

import Fragments.AboutUsFragment
import Fragments.AddStudentFragment
import Fragments.HomeFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardActivity : AppCompatActivity() {

   private lateinit var bottomNavMenu : BottomNavigationView

    private var studentRepo = StudentRepo.managerInstance

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        //binding
        bottomNavMenu = findViewById(R.id.bottomNavMenu)
//        studentRepo = StudentRepo.managerInstance

        // for default homepage
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainContainer, HomeFragment())
            commit()
        }

        populateFakeStudents()


        bottomNavMenu.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.homePage -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.mainContainer, HomeFragment())
                        commit()
                    }
                    true
                }
                R.id.addStudentPage -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.mainContainer, AddStudentFragment())
                        commit()
                    }
                    true

                }
                R.id.aboutPage -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.mainContainer, AboutUsFragment())
                        commit()
                    }
                    true

                }


                else -> false
            }
        }
    }

    private fun populateFakeStudents() {
        studentRepo.listStudent.add(
            Studentdetail(
            "Jitendra", "22", "https://i.pinimg.com/originals/af/8d/63/af8d63a477078732b79ff9d9fc60873f.jpg", "Male", "Kathmandu")
        )
        studentRepo.listStudent.add(
                Studentdetail(
                        "Jitendra", "22", "https://i.pinimg.com/originals/af/8d/63/af8d63a477078732b79ff9d9fc60873f.jpg", "Male", "Kathmandu")
        )
        studentRepo.listStudent.add(
                Studentdetail(
                        "Jitendra", "22", "https://i.pinimg.com/originals/af/8d/63/af8d63a477078732b79ff9d9fc60873f.jpg", "Male", "Kathmandu")
        )


    }
}