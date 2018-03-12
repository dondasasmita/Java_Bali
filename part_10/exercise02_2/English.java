package part_10.exercise02_2;

import java.util.Scanner;

public class English extends Thread {

    private String englishWord;

    public English (){
        start();
    }

    public void getWord() {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the word in English : ");
        englishWord = userInput.nextLine();
    }

    //overriding the run method that is called from start method of Thread
    public void run() {
        getWord();
        for (int i = 0 ; i < 5 ; i++){
            try {
                System.out.println(englishWord);
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Unable to use Thread");
            }
        }
    }
}
