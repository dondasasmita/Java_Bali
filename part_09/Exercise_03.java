package part_09;

import java.io.*;
import java.util.Scanner;

// Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
//be sure to close all connections

public class Exercise_03 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = null;

        System.out.println("Enter a word");
        in = new BufferedReader(new InputStreamReader(System.in));


        //readLine method demonstration
        String word = in.readLine();
        System.out.println(word);

        System.out.println(" - - - - ");

        //read method demonstration using int as a checker (scanner)
//        int checker;
//
//        while ((checker = in.read())!= -1){
//            System.out.print((char) checker);
//        }



//        char checkerCH;
//
//        while ((checkerCH = in.readLine())!= -1){
//            System.out.print((String) checker);
//        }

        in.close();

    }
}
