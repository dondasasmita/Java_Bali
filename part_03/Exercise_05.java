package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 999,999,999 : ");
        int number = userInput.nextInt();

        // use the && operator to see if the user's number is divisible by both 4 and 7
        if (number % 4 == 0 && number % 7 == 0){
            System.out.println("Divided by 4 = " + number / 4 );
            System.out.println("Divided by 7 = " + number / 7);
        }
        // use the || operator to see if the user's number is divisible by 4 or 7
        if (number % 4 == 0 || number % 7 == 0) {
            System.out.println("Divided by 4 = " + number / 4);
            System.out.println("Divided by 7 =" + number / 7);
        }

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        if (number % 4 == 0 ^ number % 7 == 0) {
            System.out.println("Divided by 4 = " + number / 4);
            System.out.println("Divided by 7 = " + number / 7);
        }
        // print out the results
    }
}


