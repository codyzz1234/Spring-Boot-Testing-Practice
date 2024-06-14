package com.DanVegaTesting.DanVegaTesting.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TodoController {
    @GetMapping(value = "test-get-I-Out-Of-Practice")
    public ResponseEntity<?> getData(){
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "status","OK",
                "message","Got Data"
        ));
    }
}
