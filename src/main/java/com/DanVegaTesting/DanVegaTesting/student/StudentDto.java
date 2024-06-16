package com.DanVegaTesting.DanVegaTesting.student;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto {
    private Long id;
    private String studentName;
    private String schoolName;

    public StudentDto(Student student) {
        this.id = student.getId();
        this.studentName = student.getStudentName();
    }

    public StudentDto(Long id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public StudentDto(String studentName, String schoolName) {
        this.id = id;
        this.studentName = studentName;
        this.schoolName = schoolName;
    }

    public StudentDto(Long id, String studentName, String schoolName) {
        this.id = id;
        this.studentName = studentName;
        this.schoolName = schoolName;
    }
}
