package com.DanVegaTesting.DanVegaTesting.student;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StudentMapperTest {
    private StudentMapper studentMapper;

    @BeforeEach
    void setUp() throws Exception {
        studentMapper = new StudentMapper();
    }


    @Test
    void studentMapToDto(){
        Student student = new Student(1L,"Kenley");
        StudentDto studentDto = studentMapper.studentToStudentDto(student);
        //Check if student entity has the same id as student dto
        assertThat(student.getId()).isEqualTo(studentDto.getId());
        assertThat(student.getStudentName()).isEqualTo(studentDto.getStudentName());

    }

    @Test
    void dtoMapToStudent(){
        StudentDto studentDto = new StudentDto(1L,"Cody");
        Student student = studentMapper.dtoToStudent(studentDto);
        assertThat(student.getId())
                .isEqualTo(studentDto.getId());
        assertThat(student.getStudentName())
                .isEqualTo(studentDto.getStudentName());
        assertThat(student.getSchoolName()).isNotNull();
    }


    @Test
    void compareList(){
        List<String> listOne = List.of("Cody","Yap");
        List<String> listTwo = List.of("Yap","Cody");
        Assertions.assertThat(listOne)
                .containsExactlyInAnyOrder(listTwo.toArray(new String[0]));
    }
}