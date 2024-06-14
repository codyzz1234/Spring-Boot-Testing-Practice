package com.DanVegaTesting.DanVegaTesting.TodoTests;

import com.jayway.jsonpath.JsonPath;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoJsonTest {
    @Test
    void compareJsonData(){
        Assertions.assertThat("Cody").isEqualTo("Yes");
    }

}
