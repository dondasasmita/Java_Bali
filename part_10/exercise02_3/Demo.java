package part_10.exercise02_3;

public class Demo {

    public static void main(String[] args) {

        //created 2 objects from Bahasa and English class
        Bahasa kata = new Bahasa();
        English word = new English();

        // calling getWord method to accept user input
        kata.getWord();
        word.getWord();

        //objects call start method from the Thread class
        kata.start();
        word.start();

//        kata.printword();
//        word.printword();

    }
}
