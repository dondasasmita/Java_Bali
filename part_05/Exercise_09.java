package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class Idioms {

    static void printWord (String word) {
        System.out.print(word);
    }

    public static void main(String[] args) {

        StringBuilder apple1 = new StringBuilder(" for an apple");
        StringBuilder apple2 = new StringBuilder(" of my eye");
        StringBuilder apple3 = new StringBuilder(" and oranges");

        StringBuilder [] apples = {apple1,apple2,apple3};

        for (int i = 0 ; i < 3 ; i++) {
            System.out.println("Idiom " + (i+1) + " : ");
            printWord("Apple");
            System.out.println(apples[i]);
        }

    }

}
