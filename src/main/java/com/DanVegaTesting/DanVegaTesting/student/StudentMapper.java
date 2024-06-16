package com.DanVegaTesting.DanVegaTesting.student;

import org.springframework.stereotype.Service;

@Service
public class StudentMapper {


    StudentDto studentToStudentDto(Student student) {
        return new StudentDto(student);
    }
    Student dtoToStudent(StudentDto studentDto) {
        if(studentDto == null){
            throw new NullPointerException("Student Dto Cannot be null");
        }
        return new Student(studentDto);
    }
}
