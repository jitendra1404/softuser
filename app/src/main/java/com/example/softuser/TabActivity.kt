package com.example.softuser

import Fragments.AboutUsFragment
import Fragments.AddStudentFragment
import Fragments.HomeFragment
import adapter.ViewpagerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabActivity : AppCompatActivity() {

    private lateinit var lstTitle: ArrayList<String>
    private lateinit var lstFragment: ArrayList<Fragment>
    private lateinit var viewPager: ViewPager2
    private lateinit var tablayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)

        viewPager = findViewById(R.id.viewPager)
        tablayout = findViewById(R.id.tablayout)


        populateList()
         val adapter = ViewpagerAdapter(lstFragment, supportFragmentManager, lifecycle)
        viewPager.adapter=adapter
        TabLayoutMediator(tablayout, viewPager){tab, position ->
            tab.text=lstTitle[position]
        }.attach()

    }
    private fun populateList(){
        lstTitle = ArrayList<String>()
        lstTitle.add(("Home"))
        lstTitle.add(("Student Details"))
        lstTitle.add(("About Us"))
        lstFragment= ArrayList<Fragment>()
        lstFragment.add(HomeFragment())
        lstFragment.add(AddStudentFragment())
        lstFragment.add(AboutUsFragment())

    }
}