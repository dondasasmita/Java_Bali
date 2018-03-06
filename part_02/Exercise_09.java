package part_02;


/**
 * Part 2 Exercise 9:
 *
 *      Use a do-while loop to print out the letters of the alphabet in reverse order.
 *
 */
public class Exercise_09 {

    public static void main(String[] args) {

        char alphabets [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int counter = 26;

        do {
            System.out.print(alphabets[counter-1]);
            counter --;
        } while (counter != 0);

    }
}


