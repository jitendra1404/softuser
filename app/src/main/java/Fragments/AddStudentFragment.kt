package Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import com.example.softuser.R


    class AddStudentFragment : Fragment(){

        private lateinit var edstudentname:EditText
        private lateinit var edstudentage:EditText
        private lateinit var edMale:RadioButton
        private lateinit var edFemale:RadioButton
        private lateinit var edothers:RadioButton
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
        edaddress=view.findViewById(R.id.edAddress)
        btnsafe=view.findViewById(R.id.btnSave)


        btnsafe.setOnClickListener{

        }
        return view
    }


        }


