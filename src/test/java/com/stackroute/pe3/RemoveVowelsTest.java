package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    private static RemoveVowels oe;

    @BeforeClass
    public static void setUp() {
        oe = new RemoveVowels();
    }

    @AfterClass
    public static void tearDown() {
        oe = null;
    }

    @Test
    //calls java class method and returns words by deleting vowels
    public void removeVowels() {
        oe = new RemoveVowels();
        String[] str2 = {"cello", "guitar", "violin", "double bass"};

        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {"cll", "gtr", "vln", "dbl bss"};

        assertArrayEquals(str1, str);


    }

    @Test
    public void AllVowels() {
        oe = new RemoveVowels();
        String[] str2 = {"aeiou","AEIOU"};

        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {"",""};

        assertArrayEquals(str1, str);


    }

    @Test
    //calls java class method and returns only consonants
    public void VowelsConsonants() {
        oe = new RemoveVowels();
        String[] str2 = {"d", "a", "e", "f"};

        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {"d","","","f",} ;

        assertArrayEquals(str1, str);


    }
    @Test
    //calls java class method and checks the given string is null or notnull
    public void notNu() {

        oe= new RemoveVowels();
        String a="";
        String x=oe.notNul("");
        assertEquals("need to be not null",x);

    }
    @Test
    //calls java class method and checks whether string is exists or not
    public void num()
    {
        oe=new RemoveVowels();
        String s="10";
        String x=oe.notNum(s);
        assertEquals("not numeric",x);
    }

}