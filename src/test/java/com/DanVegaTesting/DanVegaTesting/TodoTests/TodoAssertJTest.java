package com.DanVegaTesting.DanVegaTesting.TodoTests;

import com.DanVegaTesting.DanVegaTesting.todo.CustomObjectDto;
import com.DanVegaTesting.DanVegaTesting.todo.TodoRecord;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoAssertJTest {
    @Test
    void shouldCreateNewTodo(){
        TodoRecord recordOne = new TodoRecord("Cody",true);
        TodoRecord recordTwo = new TodoRecord("Cody",true);
        Assertions.
        assertThat(recordTwo.name())
                .startsWith("C")
                .isEqualTo("Cody");
        assertThat(recordOne).isNotEqualTo(recordTwo);
    }
    @Test
    void objectsShouldBeEqual(){
        CustomObjectDto objectDto = new CustomObjectDto(15,"Cody");
        CustomObjectDto objectDto2 = new CustomObjectDto(15,"Cody");
        assertThat(objectDto).isEqualTo(objectDto2);
    }

    @Test
    void shoutNotBeNull(){

    }
}
