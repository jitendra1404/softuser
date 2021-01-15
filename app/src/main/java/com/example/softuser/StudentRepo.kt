package com.example.softuser

class StudentRepo {

    var listStudent = arrayListOf<Studentdetail>()

  companion object {
      private var instance : StudentRepo? = null

      val managerInstance : StudentRepo
      get() {

          if (instance == null) {
                instance = StudentRepo()
          }

          return instance!!
      }
  }
}