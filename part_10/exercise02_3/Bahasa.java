package part_10.exercise02_3;

import java.util.Scanner;

public class Bahasa extends Thread {

    private String bahasaWord;

    public Bahasa (){
//        setPriority(MAX_PRIORITY);
    }

    public void getWord() {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a word in Bahasa : ");
        bahasaWord = userInput.nextLine();
    }

    //overriding the run method that is called from start method of Thread
    public void run() {

        for (int i = 0 ; i < 10 ; i++){
            //setting the priority to the highest
            setPriority(MAX_PRIORITY);
            System.out.println(getPriority());
            try {
                System.out.println(bahasaWord + " is ");
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Unable to use Thread");
            }
        }
    }
}
