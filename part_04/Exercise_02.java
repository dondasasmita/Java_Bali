package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */

class Exercise2 {

    public static void main(String[] args) {

        int [] years = new int [2017];

        for (int i = 0 ; i <= years.length - 1 ; i ++) {
            years [i] = i + 1;
        }

        for (int i = years.length - 1 ; i >= 0 ; i --) {
            if (years [i] % 2 != 0) {
                System.out.println(years [i]);
            }
        }
    }
}
