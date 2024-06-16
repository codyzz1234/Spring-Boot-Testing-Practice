package com.DanVegaTesting.DanVegaTesting.student;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    private final StudentMapper studentMapper;
    private final StudentRepository studentRepository;

    public StudentService(StudentMapper studentMapper, StudentRepository studentRepository) {
        this.studentMapper = studentMapper;
        this.studentRepository = studentRepository;
    }

    @Transactional
    public StudentDto saveNewStudent(StudentDto studentDto){
        //These calls here require dependencies. In this case student mapper and student repository.
        //In the test class, the methods used here will be "mocked".
        Student student = studentMapper.dtoToStudent(studentDto);
        student = studentRepository.save(student);
        return studentMapper.studentToStudentDto(student);
    }

    public List<StudentDto> getAllStudents(){
        return studentRepository.findAll()
                .stream()
                .map(studentMapper::studentToStudentDto).collect(Collectors.toList());
    }
}
