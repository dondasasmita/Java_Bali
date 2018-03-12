package part_10.exercise02_3;

import java.util.Scanner;

public class Bahasa extends Thread {

    private String bahasaWord;


    public Bahasa (String name){
        super(name);
        setPriority(MAX_PRIORITY);
        start();
        try {
            join(100);
        } catch (Exception e){
            System.out.println("Unable to join");
        }

    }

    public synchronized void getWord() {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a word in Bahasa : ");
        bahasaWord = userInput.nextLine();
    }

    //overriding the run method that is called from start method of Thread
    //used syncronized keyword to let the method to finish before proceeding to the other method.
    public synchronized void run() {
        getWord();
        for (int i = 0 ; i < 5 ; i++){
            try {
                System.out.println(bahasaWord + " is ");
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Unable to use Thread");
            }
        }
    }
}
