package Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.softuser.DashboardActivity
import com.example.softuser.R
import com.example.softuser.StudentRepo
import com.example.softuser.Studentdetail


class AddStudentFragment : Fragment(){

        private lateinit var edstudentname:EditText
        private lateinit var edstudentage:EditText
        private lateinit var edMale:RadioButton
        private lateinit var edFemale:RadioButton
        private lateinit var edothers:RadioButton
        private lateinit var imageUrl:EditText
        private lateinit var edaddress:TextView
        private lateinit var btnsafe:Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_add_student, container, false)

        edstudentname=view.findViewById(R.id.edstudentname)
        edstudentage=view.findViewById(R.id.edstudentage)
        edMale =view.findViewById(R.id.edMale)
        edFemale = view.findViewById(R.id.edFemale)
        edothers =view.findViewById(R.id.edOther)
        imageUrl=view.findViewById(R.id.ImageUrl)
        edaddress=view.findViewById(R.id.edAddress)
        btnsafe=view.findViewById(R.id.btnSave)


        btnsafe.setOnClickListener{
            StudentRepo.managerInstance.listStudent.add(Studentdetail(
                edstudentname.text.toString(),
                edstudentage.text.toString(),
                imageUrl.text.toString(),
                "Male",
                edaddress.text.toString()
            ))
            Toast.makeText(requireContext(), "Successfully added", Toast.LENGTH_SHORT).show()
        }
        return view

    }
       

    }


