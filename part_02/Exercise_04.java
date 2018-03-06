package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter weight in pounds : ");
        double weightInPound = userInput.nextDouble();
        double weightInKg = weightInPound * 0.454;

        System.out.println("Weight in Pound : " + weightInPound);
        System.out.println("Weight in Kilo : " + weightInKg);
    }


}