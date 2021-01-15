package com.example.softuser

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable


data class Studentdetail (
        val Name:String?=null,
         val Age:String?=null,
        val Image:String?=null,
        val Gender:String?=null,
        val Address:String?=null

):Serializable

