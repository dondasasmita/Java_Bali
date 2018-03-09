package part_08.exercise03;

import java.util.Scanner;

public class B {

    static void addTwoIntegers () {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = userInput.nextInt();

        System.out.print("Enter another number: ");
        int b = userInput.nextInt();

        System.out.println("The result is " + (a+b));
    }
}
