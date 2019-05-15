package com.stackroute.pe3;

public class RemoveVowels {

    public  String[] vowelsRemove(String[] instruments) {



        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = instruments[i].replaceAll("[aAEeIiOouU]", "");
            System.out.println(instruments[i]);
        }
        return instruments;

    }

    public String notNul(String a)
    {

        String res="";
        if(a=="")
        {
           res="need to be not null";
        }
        return res;

    }
    public String notNum(String s)
    {

        String res="";
        if(!s.matches("[a-zA-Z_]+"))
        {
            res="not numeric";
        }
        return res;

    }
}