package part_10.exercise02_2;

import java.util.Scanner;

public class Bahasa extends Thread {

    private String bahasaWord;

    public void getWord() {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a word in Bahasa : ");
        bahasaWord = userInput.nextLine();
    }

    //overriding the run method that is called from start method of Thread
    public void run() {

        for (int i = 0 ; i < 5 ; i++){
            System.out.println(bahasaWord + " is ");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Unable to use Thread");
            }
        }
    }
}
