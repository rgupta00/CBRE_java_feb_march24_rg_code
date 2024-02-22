package com.calapp;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator=null;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("before any test case");
    }


    @BeforeEach
    public void beforeEach(){
         calculator=new Calculator();
    }

    @Test
    public void testDivide(){
        assertEquals(4, calculator.divide(20,5));
    }

    @Test
    public void testDivideWithException(){
       assertThrows(ArithmeticException.class, ()->calculator.divide(20,0),"divide by zero");
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    @DisplayName("add test 2 numbers")
    public void addTest(){
        assertEquals(5, calculator.add(2,3));
    }

  //  @Disabled
    @Test
    @DisplayName("mul test 2 numbers")
    public void mulTest(){
       assertEquals(6, calculator.mul(2,3));
    }
    @AfterEach
    public void afterEach(){
        calculator=null;
    }

    @AfterAll
    public static void AfterAll(){
        System.out.println("after all test case");
    }
}
