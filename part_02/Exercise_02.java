package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner userInput1 = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Enter radius : ");
        double radius = userInput1.nextDouble();
        System.out.println("Enter length: ");
        double length = userInput2.nextDouble();

        double volume = Math.PI * (radius * radius) * length;
        double area = radius * radius * 3.1415;

        System.out.println("The volume is : " + volume);
        System.out.println("The area is : " + area);
    }


}