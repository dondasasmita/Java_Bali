package part_09.exercise01;

import java.sql.Time;

public class TickTock {

    private String message1 = "Tick";
    private String message2 = "Tock";

    //this method will start timer and take int time to loop tick tock messages
    public void startTimer(int time) {
       for (int i = 0 ; i <= time ; i++) {
           System.out.print(message1);
           try {
               Thread.sleep(500); // try and catch has to be used to handle Interrupted Exception
               System.out.print(".");
               System.out.print(".");
               System.out.print(".");
           }
           catch (java.lang.InterruptedException ioe){
               System.out.println("An error has occurred. Restart program or contact the developer");
           }
           System.out.println(message2);
           try {
               Thread.sleep(500); // try and catch has to be used to handle Interrupted Exception
//               System.out.print(".");
//               System.out.print(".");
//               System.out.print(".");
           }
           catch (java.lang.InterruptedException ioe){
               System.out.println("An error has occurred. Restart program or contact the developer");
           }
       }
    }

    public static void main(String[] args) {

        TickTock timer1 = new TickTock();

        timer1.startTimer(30);
    }

}
