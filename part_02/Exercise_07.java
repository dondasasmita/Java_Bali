package part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter numbers in minutes : ");

        double numbersInMinutes = userInput.nextDouble();
        double numberInDays = numbersInMinutes / 1440;
        double numberInYears = numberInDays / 365;

        System.out.println("In Days : " + numberInDays);
        System.out.println("In Years : " + numberInYears);
    }

}


