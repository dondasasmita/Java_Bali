package part_09;


//Bonus questions not covered in book.

//Write a class that can get the date of the last modification, can check whether or not you can write to that file
//and can set a file to read-only.
//Hint, use the "File" class.

import java.io.File;
import java.text.SimpleDateFormat;

public class Exercise_04 {

    public static void main(String[] args) {

        File fileToRead = new File("/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/file1.txt");
        SimpleDateFormat dateFormat = new SimpleDateFormat("DD/MM/YY HH:mm:ss");

        System.out.println("The last modification done on : " + dateFormat.format(fileToRead.lastModified()));

        boolean allowedToWrite = fileToRead.canWrite();

        if (allowedToWrite = true) {
            System.out.println("You are allowed to write the file");
        } else {
            System.out.println("You are not allowed to write the file");
        }
    }


}








