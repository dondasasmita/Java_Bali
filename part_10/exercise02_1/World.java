package part_10.exercise02_1;


public class World implements Runnable {

    //Runnable interface calls run method. World class is overriding the run method
    public void run() {

        for (int i = 0 ; i < 5 ; i++){
            System.out.println("World");
            try {
                Thread.sleep(500);
            } catch (Exception e){
                System.out.println("Error");
            }
        }
    }
}
