package part_04;

/**

 Create, populate, and print out a two-dimensional array that will show the following output:

 0 1 2 3 4 5 6 7 8 9
 10 11 12 13 14 15 16 17 18 19
 20 21 22 23 24 25 26 27 28 29
 30 31 32 33 34 35 36 37 38 39
 40 41 42 43 44 45 46 47 48 49

 */

public class Exercise_03 {

    public static void main(String[] strings) {

        int [] [] twoDArray = new int [5][10];

        for (int i = 0 ; i <= twoDArray.length - 1 ; i ++ ) {
            for (int j = 0 ; j <= twoDArray[i].length - 1 ; j ++) {
                twoDArray [i][j] = (i * 10) + j;
            }
        }

        for (int i = 0 ; i <= twoDArray.length - 1 ; i ++ ) {
            for (int j = 0 ; j <= twoDArray[i].length - 1 ; j ++) {
                System.out.print(twoDArray[i][j]);
            }
            System.out.println();
        }





    }
}