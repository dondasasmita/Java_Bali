package part_08;

import java.util.Scanner;

public class Exercise_01 {

    static void takeNumberprintNumbers(){

        Scanner userInput = new Scanner(System.in);

            try {
                int number = userInput.nextInt();
                System.out.println("Well done! You have entered:" + number);
            }
            catch (Exception ieo) {
                System.out.println("You must enter an int");
            }
        }

    public static void main(String[] args) {

        System.out.println("Enter a number : ");
        takeNumberprintNumbers();
    }
}


