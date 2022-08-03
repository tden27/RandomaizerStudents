package com.example.randomaizerstudents.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
    private var name: String = ""
    private var commandId: Int = 0

    override fun toString(): String {
        return "Student(id=$id, name='$name', commandId=$commandId)"
    }


}
