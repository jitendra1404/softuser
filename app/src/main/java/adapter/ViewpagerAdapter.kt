package adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewpagerAdapter (

    private val lstFragment: ArrayList<Fragment>,
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle):
        FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return lstFragment.size
    }

    override fun createFragment(position: Int): Fragment {
        return lstFragment[position]
    }
}

