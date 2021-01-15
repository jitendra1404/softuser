package com.example.softuser

import Fragments.HomeFragment
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class StudentAdapter (
        val lststudentdetail:ArrayList<Studentdetail>,
        val context:Context
):RecyclerView.Adapter<StudentAdapter. StudentViewHolder>(){

    class StudentViewHolder(view: View):RecyclerView.ViewHolder(view){

        val imageView2:ImageView
        val edStudentName:TextView
        val edStudentAge:TextView
        val edStudentGender:TextView
        val edStudentAddress:TextView
        val del:ImageView

        init {
            imageView2=view.findViewById(R.id.imageView2)
            edStudentName=view.findViewById(R.id.edUserName)
            edStudentAge=view.findViewById(R.id.edUserAge)
            edStudentGender=view.findViewById(R.id.edUserGender)
            edStudentAddress=view.findViewById(R.id.edUserAddress)
            del=view.findViewById(R.id.del)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.studentlayout, parent, false)

        return StudentViewHolder(view)

    }


    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {

        val student08 = lststudentdetail[position]
        holder.edStudentName.text=student08.Name
        holder.edStudentAddress.text=student08.Address
        holder.edStudentGender.text=student08.Gender
        holder.edStudentAge.text=student08.Age.toString()



        Glide.with(context).load(student08.Image).into(holder.imageView2)

        holder.del.setOnClickListener {
            lststudentdetail.removeAt(position)
            notifyItemRemoved(position)
            notifyDataSetChanged()
            notifyItemRangeChanged(position,lststudentdetail.size)

        }

    }

    override fun getItemCount(): Int {
        return lststudentdetail.size
    }


}

