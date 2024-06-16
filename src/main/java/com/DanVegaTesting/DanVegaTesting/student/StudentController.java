package com.DanVegaTesting.DanVegaTesting.student;

import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Controller
public class StudentController {


    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getStudentById(@Param(value = "id") Long id){
        return null;
    }

    @PostMapping(value = "")
    public ResponseEntity<?> addNewStudent(@RequestBody StudentDto dto){
        StudentDto studentDto = studentService.saveNewStudent(dto);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("data",studentDto));
    }

}
