package part_11;

/**
 make a new generic method called sumArray that will return the
 sum of all numbers in the array (no matter data type of numbers
 the array has in it)
 */


public class Exercise_04 <T> {

//    T totalSum;
//
//
//    public T getTotalSum() {
//        return totalSum;
//    }
//
//    public void setTotalSum(T totalSum) {
//        this.totalSum = totalSum;
//    }

    public static <T extends Number> void sumArray (T[] anyArray) {

        //variable holds the total sum declared as a double (this is a temporary solution)
       double totalSum = 0;

        for (int counter = 0 ; counter < anyArray.length ; counter ++){
            totalSum += anyArray[counter].doubleValue(); //using intValue method to cast the value to an int
        }

        System.out.println(totalSum);
    }

    public static void main(String[] args) {

        //demonstration using Integer
        Integer [] numArray = new Integer [3];
        numArray[0] = 100;
        numArray[1] = 200;
        numArray[2] = 300;

        sumArray(numArray);

        //demonstration using double
        Double [] doubleArray = new Double [3];
        doubleArray [0] = 1.2;
        doubleArray [1] = 2.2;
        doubleArray [2] = 3.2;

        sumArray(doubleArray);

    }

}


