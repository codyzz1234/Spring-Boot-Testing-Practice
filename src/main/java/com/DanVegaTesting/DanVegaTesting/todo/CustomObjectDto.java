package com.DanVegaTesting.DanVegaTesting.todo;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class CustomObjectDto {
    private int age;
    private String name;

    public CustomObjectDto(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomObjectDto objectDto = (CustomObjectDto) o;
        return age == objectDto.age && Objects.equals(name, objectDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
