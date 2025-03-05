/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany;

import static org.testng.Assert.*;
import org.testng.annotations.*;

public class StudentNGTest {
    private Student student;

    @BeforeClass
    public void setUpClass() {
        System.out.println("Starting test class...");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("Test class finished.");
    }

    @BeforeMethod
    public void setUpMethod() {
        student = new Student("S001", "John Doe", 20);
    }

    @AfterMethod
    public void tearDownMethod() {
        student = null;
    }

    @Test
    public void testGetStudentId() {
        System.out.println("Testing getStudentId");
        String expResult = "S001";
        String result = student.getStudentId();
        assertEquals(result, expResult);
    }

    @Test
    public void testGetName() {
        System.out.println("Testing getName");
        String expResult = "John Doe";
        String result = student.getName();
        assertEquals(result, expResult);
    }

    @Test
    public void testGetAge() {
        System.out.println("Testing getAge");
        int expResult = 20;
        int result = student.getAge();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetAge() {
        System.out.println("Testing setAge");
        int newAge = 25;
        student.setAge(newAge);
        assertEquals(student.getAge(), newAge);
    }

    @Test
    public void testUpdateName() {
        System.out.println("Testing updateName");
        String newName = "Jane Doe";
        student.updateName(newName);
        assertEquals(student.getName(), newName);
    }
}