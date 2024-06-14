package com.DanVegaTesting.DanVegaTesting.TodoTests;

import com.DanVegaTesting.DanVegaTesting.todo.TodoRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoJUnitTest {

    @Test
    void shouldCreate(){
        var test = new TodoRecord("TEST",false );
        Assertions.assertEquals("TEST",test.name(),"Todo Name was not equal to TEST");
        Assertions.assertFalse(test.completed());

    }


}
