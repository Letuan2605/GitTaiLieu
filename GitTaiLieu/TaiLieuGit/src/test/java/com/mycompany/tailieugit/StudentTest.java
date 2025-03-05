/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.tailieugit;

import com.mycompany.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class StudentTest {
    @Test
    public void testGetName() {
        Student student = new Student("S001", "John Doe", 20);
        Assert.assertEquals(student.getName(), "John Doe");
    }

    @Test
    public void testSetAge() {
        Student student = new Student("S002", "Alice", 22);
        student.setAge(25);
        Assert.assertEquals(student.getAge(), 25);
    }

    @Test
    public void testUpdateName() {
        Student student = new Student("S003", "Bob", 21);
        student.updateName("Robert");
        Assert.assertEquals(student.getName(), "Robert");
    }
}