package part_10.exercise02_1;

public class Hello implements Runnable{

    //Runnable interface calls run method. Hello class is overriding the run method
    public void run() {

        for (int i = 0 ; i < 5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println("Error");
            }

        }
    }
}
