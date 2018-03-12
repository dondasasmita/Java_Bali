package part_10.exercise02_2;

public class Demo {

    public static void main(String[] args) {

        //created 2 objects from Bahasa and English class
        Bahasa kata = new Bahasa();
        English word = new English();

        // calling getWord method to accept user input
        kata.getWord();
        word.getWord();

        //objects call start method from the Thread class
//        kata.start();
//        word.start();

        //get name of thread by passing the target and the name in the Thread constructor
        Thread thread1 = new Thread(kata,"Thread 1");
        Thread thread2 = new Thread(word,"Thread 2");


        thread1.start();
        thread2.start();

//        kata.printword();
//        word.printword();

    }
}
