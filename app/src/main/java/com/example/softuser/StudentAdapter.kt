package com.example.softuser

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class StudentAdapter (
       val lststudentdetail:ArrayList<studentdetail>,
       val context:Context
):RecyclerView.Adapter<StudentAdapter. StudentViewHolder>(){

    class StudentViewHolder(view: View):RecyclerView.ViewHolder(view){

        val imageView2:ImageView
        val edStudentName:TextView
        val edStudentAge:TextView
        val edStudentGender:TextView
        val edStudentAddress:TextView

        init {
            imageView2=view.findViewById(R.id.imageView2)
            edStudentName=view.findViewById(R.id.edstudentname)
            edStudentAge=view.findViewById(R.id.edstudentage)
            edStudentGender=view.findViewById(R.id.Gender)
            edStudentAddress=view.findViewById(R.id.edAddress)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.studentlayout, parent, false)

        return StudentViewHolder(view)

    }


    override fun onBindViewHolder(holder: StudentAdapter.StudentViewHolder, position: Int) {
        // val list = arrayListOf<Int>(R.drawable.jitendra)
        val student08 = lststudentdetail[position]
        holder.edStudentName.text=student08.Name
        holder.edStudentAddress.text=student08.Address
        holder.edStudentGender.text=student08.Gender
        holder.edStudentAge.text=student08.Age.toString()


        Glide.with(context).load(student08.Image).into(holder.imageView2)

    }

    override fun getItemCount(): Int {
        return lststudentdetail.size
    }


}

