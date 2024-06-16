package com.DanVegaTesting.DanVegaTesting.student;

import org.springframework.stereotype.Service;

@Service
public class StudentMapper {


    StudentDto studentToStudentDto(Student student) {
        return new StudentDto(student);
    }
    Student dtoToStudent(StudentDto studentDto) {
        return new Student(studentDto);
    }
}
