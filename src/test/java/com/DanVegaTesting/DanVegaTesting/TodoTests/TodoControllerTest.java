package com.DanVegaTesting.DanVegaTesting.TodoTests;

import com.DanVegaTesting.DanVegaTesting.todo.TodoRecord;
import com.DanVegaTesting.DanVegaTesting.todo.TodoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springdoc.webmvc.core.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.*;

import java.util.List;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Slf4j
@WebMvcTest(TodoControllerTest.class)
public class TodoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TodoRepository todoRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void shouldFindAllTodos() throws Exception {
        List<TodoRecord> todos = List.of(
                new TodoRecord("Cody", true),
                new TodoRecord("Kenley", true),
                new TodoRecord("Brian", false)
        );

        mockMvc.perform(get("/api/todos"))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().json(objectMapper.writeValueAsString(todos)));
    }
}
