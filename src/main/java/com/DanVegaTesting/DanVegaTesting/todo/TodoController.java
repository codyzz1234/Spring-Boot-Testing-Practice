package com.DanVegaTesting.DanVegaTesting.todo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TodoController {
    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = "/api/todos")
    public ResponseEntity<?> getData(){
        List<TodoRecord> records = todoRepository.findAllRecords();
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "status","OK",
                "message","Found Data",
                "data",records
        ));
    }
}
