package part_08.exercise03;

public class A {

    public static void main(String[] args) throws Exception {

        boolean isCorrect = false;

        while (!isCorrect) {
            try {
                B.addTwoIntegers();
                System.out.println("You entered two integers");
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("Did you enter two ints? Try again");
            }
        }


    }
}
