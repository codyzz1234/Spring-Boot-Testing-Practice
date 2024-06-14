package com.DanVegaTesting.DanVegaTesting.todo;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepository {
    public List<TodoRecord> findAllRecords(){
        List<TodoRecord> todos = List.of(
                new TodoRecord("Cody",true),
                new TodoRecord("Kenley",true),
                new TodoRecord("Brian",false)
        );
        return todos;
    }
}
