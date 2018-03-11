package part_09;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercise_02 {

    public static void main(String[] args) throws IOException {

        //using bufferedinputstream to check file from FileInputStream
        BufferedInputStream scan = new BufferedInputStream(new FileInputStream("/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/file1.txt"));

        //created a check int and check everybyte and cast to char
        int checker;
        while ((checker = scan.read()) != -1); {
            System.out.println((char)checker);
        }

        //close the file
        scan.close();
    }
}
