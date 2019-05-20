package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntArraTest {

    private static IntArra arr;

    @BeforeClass
    public static void setUp() {
        arr = new IntArra();
    }

    @AfterClass
    public static void tearDown() {
       arr = null;
    }




        int[] as={2,21,32};

        @Test
        //calls java class method and returns the given number is even or odd
        public void evenTest1()
        {

            String[] s=arr.isEven(as);
            String[] a={"even","odd","even"};

            assertEquals(a,s);

        }

        @Test
        //calls java class method and deletes the prime number
        public void primeTest2()
        {
            int[] pr={4,17,19};
            int[] s=arr.isPrim(pr);
            int[] c={4};
            assertArrayEquals(c,s);
        }
        @Test
        //calls java class method and reverse the given integer array
        public void reverseTest3()
        {
            int[] s=arr.isRev(as);
            int[] a={32,21,2};
            assertArrayEquals(a,s);
        }

}



