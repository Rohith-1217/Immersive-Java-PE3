package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoArraTest {


    private static TwoArra two;

    @BeforeClass
    public static void setUp() {
        two = new TwoArra();
    }

    @AfterClass
    public static void tearDown() {
        two = null;
    }

    @Test
    //compare the arrays and returns equal if thet are same
    public  void compar()
    {
        String[] a1={"10","20","30"};
        String[] a2={"10","20","40"};
        String s="not equal";
        assertEquals(s,two.isComp(a1,a2));

    }
    @Test
    //remove duplicates and print
    public void dupli()
    {
        String[] a1={"10","20","10","30"};
        String s="duplicates found";
        assertEquals(s,two.isDupli(a1));
    }
    @Test
    //appending the first element of one array to another array at last
    public void appen()
    {
        String[] a1={"10","20","30"};
        String[] a2={"50","20","40"};
        String[] s={"10","20","30","50"};
        assertArrayEquals(s,two.isAppen(a1,a2));
    }

    @Test
    //prepending the mid element of one array to another array at first
    public void prepen()
    {
        String[] a1={"10","20","30"};
        String[] a2={"50","60","70"};
        String[] s={"60","10","20","30"};
        assertArrayEquals(s,two.isPrepen(a1,a2));
    }


}