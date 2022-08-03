package com.example.randomaizerstudents.service

import com.example.randomaizerstudents.entity.Student
import com.example.randomaizerstudents.repository.StudentRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class StudentService(val studentRepository: StudentRepository) {

    fun getStudents(id: Long): Optional<Student> {
        return studentRepository.findById(id)
    }

    fun saveStudent(student: Student) {
        studentRepository.save(student)
    }
}