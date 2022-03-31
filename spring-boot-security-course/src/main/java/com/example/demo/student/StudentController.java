package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

//    var it = new UUID();
    private static final List<Student> STUDENTS = Arrays.asList(
      new Student(UUID.randomUUID(), "James Bond"),
      new Student(UUID.randomUUID(), "Maria Jones"),
      new Student(UUID.randomUUID(), "Anna Smith")
    );

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") String studentId) {
        return STUDENTS.stream()
                .filter(student -> studentId.equals(student.getStudentId().toString()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(
                        "Student " + studentId + " does not exists"
                ));
    }
}
