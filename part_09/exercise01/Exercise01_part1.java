/*
Write a program that copies a text file.In the process, have it convert all spaces into hyphens, use the byte stream file classes.
Use the traditional approach to closing a file by explicitly calling close().
 */

package part_09.exercise01;

import java.io.*;

public class Exercise01_part1 {

    public static void main(String[] args) {

        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            // initialize
            in = new BufferedReader(new FileReader("/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/file1.txt"));
            out = new BufferedWriter(new FileWriter("/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/file1_modified.txt"));
            int c;

            //check if there is data in the file, read file until no character found
            while ((c = in.read()) != -1) {
                //write the data byte by byte to the outputStream
                try {
                    // if space
                    if (c == 32) {
                        c = 45;
                        out.write(c);
                    }
                    else {
                       out.write(c);
                    }
                }
                catch (IOException ioe) {
                    System.out.println("Unable to change character.");
                }
            }

        }
        catch (IOException ioe) {
            System.out.println("Unable to read file. Check you file.");
        }
        finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null){
                    out.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("No connection to close");
            }
        }

    }
}
