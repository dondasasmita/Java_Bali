package part_11.exercise03_answer;

public class QueueController {

    public static void main(String[] args) {

        // Demonstrate using type Integer

        Integer [] numbers = new Integer [10];

        Queue <Integer> queue = new Queue (numbers);

        for (int i = 0 ; i < 10 ; i++) {
            queue.put(i);
        }

        for (int i = 0 ; i < 10 ; i++) {
            System.out.print(queue.get() + " | ");
        }


        // Let's try with String
        String [] balis = new String[5];

        Queue <String> queue1 = new Queue(balis);

        for (int i = 0 ; i < 5 ; i++){
            queue1.put("Bali");
        }

        for (int i = 0 ; i < 5 ; i++){
            System.out.println(queue1.get());
        }


    }
}
