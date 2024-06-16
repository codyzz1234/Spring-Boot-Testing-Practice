package com.DanVegaTesting.DanVegaTesting.student;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "school_name")
    private String schoolName;


    public Student(Long id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }
    public Student(StudentDto studentDto) {
        this.id = studentDto.getId();
        this.studentName = studentDto.getStudentName();
    }

}
