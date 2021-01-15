package Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.softuser.R
import com.example.softuser.StudentAdapter
import com.example.softuser.StudentRepo

class HomeFragment :Fragment(){

    private lateinit var studentRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false )

        studentRecyclerView = view.findViewById(R.id.studentRecyclerView)
        studentRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        studentRecyclerView.adapter = StudentAdapter(StudentRepo.managerInstance.listStudent, requireContext())

        return view
    }

    }

