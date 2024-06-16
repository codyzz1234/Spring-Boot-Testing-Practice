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
}
