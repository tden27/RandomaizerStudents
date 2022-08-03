package com.example.randomaizerstudents

import com.example.randomaizerstudents.entity.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class RandomaizerStudentsApplicationTests {

    @Test
    fun contextLoads() {
        val roleSet: HashSet<Student> = HashSet()

        val student = Student()

        roleSet.add(student)

        Assertions.assertEquals(1, roleSet.size)
    }

}
