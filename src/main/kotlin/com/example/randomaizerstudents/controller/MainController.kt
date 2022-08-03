package com.example.randomaizerstudents.controller

import com.example.randomaizerstudents.entity.Student
import com.example.randomaizerstudents.service.StudentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController(private val studentService: StudentService) {

    @GetMapping("students/{id}")
    fun getStudentById(@PathVariable id: Long): String {
        return studentService.getStudents(id).get().toString()
    }

    @PostMapping("save_student")
    fun saveStudent(student: Student) {
        studentService.saveStudent(student)
    }
}