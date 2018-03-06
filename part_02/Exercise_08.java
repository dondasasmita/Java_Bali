package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int number = userInput.nextInt();

        int check = 0;

        while (check != number) {
            System.out.println("Finding... " + check);
            check ++;
        }
        System.out.println("Number is found! " + number);
    }
}

