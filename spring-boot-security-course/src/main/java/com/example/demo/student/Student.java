package com.example.demo.student;

import java.util.UUID;

public class Student {

    private final UUID studentId;
    private final String studentName;

    public Student(UUID studentId,
                   String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
