package com.DanVegaTesting.DanVegaTesting.student;

import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getStudentById(@Param(value = "id") Long id){
        return null;
    }

}
