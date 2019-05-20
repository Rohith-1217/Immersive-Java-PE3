package com.stackroute.pe3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarTest {

    private static StudentMar mar;

    @BeforeClass
    public static void setUp() {
        mar = new StudentMar();
    }

    @AfterClass
    public static void tearDown() {
        mar = null;
    }

    @Test
    //returns true if the marks are between 0 and 100
    public void equalNum()
    {
       String z=mar.isComp(20);
       assertEquals("true",z);
    }
    @Test
    //returns Input should not be greater than 100 if the value is greater than 100
    public void greaterNum()
    {
        String z=mar.isComp(101);
        assertEquals("Input should not be greater than 100",z);
    }
    @Test
    //returns Input should not be lesser than 0 if the value is less than 0
    public void lessNum()
    {
        String z=mar.isComp(-5);
        assertEquals("Input should not be less than 0",z);
    }

}