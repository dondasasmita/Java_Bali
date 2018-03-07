package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter miles to drive : ");
        int miles = userInput.nextInt();

        System.out.print("Enter MPG of the car : ");
        int mpg = userInput.nextInt();

        System.out.print("Enter Price per Gallon : ");
        int pricePerGallon = userInput.nextInt();

        System.out.print("Total cost of the trip is " + (miles*mpg*pricePerGallon));
    }

}