package part_11;

import java.util.ArrayList;

/**
Let's say you have an integer array and a string array. Write a single method printArray that can print all
the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

Complete the code so that it prints the following lines:

 1
 2
 3
 Hello
 World

**/

public class Exercise_01 <T> {

    // create a method that takes in any array and print the values
    public static <T> void printArray( T [] anyarray){

        for (int i = 0 ; i < anyarray.length ; i++){
            System.out.println(anyarray[i]);
        }
    }

    public static void main(String[] args) {

       // create and populate arrays String
       String [] words = new String[2];
       words[0]="Hello";
       words[1]="World";

       // create and populate arrays Integer
       Integer [] numbers = new Integer[3];
       numbers[0]=1;
       numbers[1]=2;
       numbers[2]=3;

       printArray(numbers);
       printArray(words);
    }
}






