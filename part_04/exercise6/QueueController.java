package part_04.exercise6;

public class QueueController {

    public static void main(String[] args) {

        Queue queue1 = new Queue(101);

        for (int i = 0; i <= queue1.size - 1; i++) {
            queue1.putNumber(i);
        }

        //create a method that get number from the queue
        for (int i = 0; i <= queue1.size - 1; i++) {
            if (queue1.getNumber() % 2 != 0) {
                System.out.print(queue1.getNumber() + " | ");
            }
        }
    }
}
