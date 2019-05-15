package com.stackroute.pe3;

public class CheckForConsecutiveNums {

    public static String consecutiveNums(String input){
        String[] strings=input.split(",");
      /* if (strings.length!=7){
           return "Enter 7 consecutive integers.";
       }*/
        int index=0;
        while (index<strings.length){
            if (index>0){
                try{
                    if (Math.abs(Integer.parseInt(strings[index])-Integer.parseInt(strings[index-1]))!=1){
                        return input+" non consecutive numbers";
                    }
                }catch (NumberFormatException ne){
                    return "Enter only integer values!!!";
                }

            }
            index++;
        }


        return input+" are consecutive numbers";
    }


}