package part_04;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.Scanner;
/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */

class Exercise1 {

    public static void main(String[] args) {

        int [] newArray = new int [10];
        Scanner userInput = new Scanner(System.in);

        for (int i = 0 ; i < newArray.length; i++) {
            System.out.print("Enter a number at index " + i + ": ");
            newArray [i] = userInput.nextInt();
        }

        for (int i = 2 ; i < newArray.length; i += 2) {
            System.out.println("Number at index " + i + ": " + newArray [i] + " | ");
        }

        for (int i = 9 ; i >= 0 ; i -= 2) {
            System.out.println("Number at index " + i + ": " + newArray [i] + " | ");
        }

    }
}