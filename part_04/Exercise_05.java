package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */


public class Exercise_05 {

    public static void main(String[] strings) {

        int [] easyArray = new int [5];
        int counter = 0;

        for (int index : easyArray) {
            easyArray [counter] = counter;
            counter++;
        }

        for (int index : easyArray) {
            System.out.println(easyArray [index]);
        }

    }
}