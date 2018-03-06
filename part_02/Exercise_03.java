package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter length in feet : ");
        double lengthInFeet = userInput.nextDouble();
        double lengthInMeter = lengthInFeet * 0.305;

        System.out.println("Length in feet " + lengthInFeet);
        System.out.println("Length in meter " + lengthInMeter);
    }

}