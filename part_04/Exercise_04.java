package part_04;

/**
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };
        // uncomment the lines below when your methods are ready
        System.out.println(getMaxVal(dataArray));
        System.out.println(getMinVal(dataArray));
    }

    // write a method called getMaxVal that takes in a 2D array and iterates through the array to determine the max value in array
    public static int getMaxVal (int[][] array ) {
        int max = 0;
        for (int i = 0 ; i <= array.length - 1; i ++) {
            for (int j = 0; j <= array[i].length - 1 ; j ++) {
                if (array [i][j] > max){
                    max = array [i][j];
                }
            }
        }
        return max;
    }

    // write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array
    public static int getMinVal (int [][] array) {
        int min = 0;
        for (int i = 0 ; i <= array.length -1 ; i++) {
            for (int j = 0 ; j < array[i].length - 1 ; j++) {
                if (array [i][j] < min) {
                    min = array [i][j];
                }
            }
        }
        return min;
    }

}