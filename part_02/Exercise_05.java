package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = userInput.nextInt();
        if (number == 1){
            System.out.println("One");
        }
        if (number == 2) {
            System.out.println("Two");
        }
        if (number == 3) {
            System.out.println("Three");
        }
        if (number == 4) {
            System.out.println("Four");
        }
        if (number == 5) {
            System.out.println("Five");
        }
        if (number == 6) {
            System.out.println("Six");
        }
        if (number == 7) {
            System.out.println("Seven");
        }
        if (number == 8) {
            System.out.println("Eight");
        }
        if (number == 9){
            System.out.println("Nine");
        }
        else {
            System.out.println("Other");
        }
    }

}

