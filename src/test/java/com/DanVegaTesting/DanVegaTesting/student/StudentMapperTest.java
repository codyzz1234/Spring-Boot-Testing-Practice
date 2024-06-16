package com.DanVegaTesting.DanVegaTesting.student;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
@Slf4j
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

    //Should throw null pointer exception when dto is null. In this case, a null is passed to the mapper,
    // so it is throwing a null pointer exception
    @Test
    void shouldThrowNullPointerWhenStudentDtoIsNull(){
        var message = assertThatThrownBy( () ->{
            Student student = studentMapper.dtoToStudent(null);
        }).isInstanceOf(NullPointerException.class);
    }
}