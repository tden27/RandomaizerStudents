package com.example.randomaizerstudents.repository

import com.example.randomaizerstudents.entity.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, Long> {
}