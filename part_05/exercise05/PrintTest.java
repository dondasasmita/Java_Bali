package part_05.exercise05;

public class PrintTest {

    static void print(int numOfPrint) {
        for (int i = 0 ; i < numOfPrint ; i++) {
            System.out.println("Hello People!");
        }
    }

    public static void main(String[] args) {
        print(10);
        System.out.println(" ------ ");
        print(5);
    }
}
