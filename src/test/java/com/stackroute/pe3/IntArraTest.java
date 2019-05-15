package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntArraTest {




        IntArra p=new IntArra();
        int[] as={2,21,32};

        @Test
        public void evenTest1()
        {

            String[] s=p.isEven(as);
            String[] a={"even","odd","even"};

            assertEquals(a,s);

        }

        @Test
        public void primeTest2()
        {
            int[] pr={4,17,19};
            int[] s=p.isPrim(pr);
            int[] c={4};
            assertArrayEquals(c,s);
        }
        @Test
        public void reverseTest3()
        {
            int[] s=p.isRev(as);
            int[] a={32,21,2};
            assertArrayEquals(a,s);
        }

    }



