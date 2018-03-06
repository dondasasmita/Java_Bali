
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter investment value : ");
        int amount = userInput.nextInt();
        System.out.print("Enter interest rate p.a. : ");
        int interestRate = userInput.nextInt();
        System.out.print("Enter number of years to invest : ");
        int year = userInput.nextInt();

        int investmentReturn = (amount * interestRate/100) * year;

        System.out.print("Future value : " + (amount + investmentReturn));
    }

}


