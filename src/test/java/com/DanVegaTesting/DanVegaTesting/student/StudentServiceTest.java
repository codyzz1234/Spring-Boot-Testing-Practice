package com.DanVegaTesting.DanVegaTesting.student;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

class StudentServiceTest {

    //declare dependencies

    //The Service we want to test
    @InjectMocks
    private StudentService studentService;

    @Mock
    private StudentRepository studentRepository;

    @Mock
    private StudentMapper studentMapper;

    @BeforeEach
    void beforeAll() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void check_if_student_successfully_saved() {

        // Entities/Objected needed for this operatiosn
        Student student = new Student(1L,"Cody","TFCA");

        StudentDto requestBodyDto = new StudentDto("Cody","TFCA");
        StudentDto studentSaved = new StudentDto(1L,"Cody","TFCA");

        //Mock the calls
        Mockito.when(studentMapper.dtoToStudent(requestBodyDto)).thenReturn(student);
        Mockito.when(studentRepository.save(student))
                .thenReturn(student);
        Mockito.when(studentMapper.studentToStudentDto(student))
                .thenReturn(studentSaved);
        //When
        StudentDto responseDto = studentService.saveNewStudent(requestBodyDto);
        //Then
        Assertions.assertThat(responseDto.getId()).isEqualTo(studentSaved.getId());
        Assertions.assertThat(responseDto.getId()).isEqualTo(studentSaved.getId());

        //verify methods
        Mockito.verify(studentMapper, Mockito.times(1)).dtoToStudent(requestBodyDto);
        Mockito.verify(studentRepository, Mockito.times(1)).save(student);
        Mockito.verify(studentMapper, Mockito.times(1)).studentToStudentDto(student);
    }
    @Test
    void testGetAllStudents(){
        List<Student> bodyList = List.of(
                new Student(1L,"Cody"),
                new Student(2L,"Kenley")
        );
        List<StudentDto> mappedDto = List.of(
                new StudentDto(1L,"Cody"),
                new StudentDto(2L,"Kenley")
        );
        Mockito.when(studentRepository.findAll()).thenReturn(bodyList);
        List<StudentDto> studentList = studentService.getAllStudents();
    }
}