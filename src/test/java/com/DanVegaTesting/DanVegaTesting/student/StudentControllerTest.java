package com.DanVegaTesting.DanVegaTesting.student;

import org.junit.jupiter.api.*;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    //Run this before all beforeach methods/
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Before all Setup");
    }

    //Run this after all after each methods
    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("After all TearDown");
    }

    @BeforeEach
    public void beforeEachMethod(){
        System.out.println("Testing this before each method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Testing this after each method");
    }

    @Test
    public void testMethod1(){
        System.out.println("Test Method 1");
    }

    @Test
    public void testMethod2(){
        System.out.println("Test Method 2");
    }

}