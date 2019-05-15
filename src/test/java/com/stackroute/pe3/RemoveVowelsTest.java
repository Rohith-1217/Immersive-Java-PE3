package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {


    RemoveVowels oe;


    @Test
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
    public void VowelsConsonants() {
        oe = new RemoveVowels();
        String[] str2 = {"d", "a", "e", "f"};

        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {"d","","","f",} ;

        assertArrayEquals(str1, str);


    }
    @Test

    public void notNu() {

        oe= new RemoveVowels();
        String a="";
String x=oe.notNul("");
assertEquals("need to be not null",x);

    }
    @Test

public void num()
{
    oe=new RemoveVowels();
    String s="10";
    String x=oe.notNum(s);
    assertEquals("not numeric",x);
}

}