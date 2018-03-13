package part_11;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 <T> {

    public static <T> void swapArray(T[] anyarray, int index1, int index2) {

        //generic temp "box"
        T tempBox = anyarray[index1];
        anyarray[index1] = anyarray[index2];
        anyarray[index2] = tempBox;

    }

    public static void main(String[] args) {

        Integer[] arrayNum = new Integer[10];

        for (int i = 0 ; i < arrayNum.length ; i++) {
            arrayNum[i] = i;
        }

        //check value before swap
        System.out.println("This is arrayNum index 0: " + arrayNum[0]);
        System.out.println("This is arrayNum index 9: " + arrayNum[9]);


        //swapArray method is called
        swapArray(arrayNum,0,9);

        //result should be 0 upon swap
        System.out.println("This is arrayNum index 0: " + arrayNum[0]);

        //result should be 9 upon swap
        System.out.println("This is arrayNum index 9: " + arrayNum[9]);


        //ANOTHER TYPE OF ARRAY

        String[] arrayBrands = new String[5];

        arrayBrands[0] = "Coding Nomads";
        arrayBrands[1] = "Outpost";
        arrayBrands[2] = "Apple";
        arrayBrands[3] = "Microsoft";
        arrayBrands[4] = "Google";

        //check value before swap
        System.out.println("This is array index 0: " + arrayBrands[0]);
        System.out.println("This is array index 4: " + arrayBrands[4]);


        //swapArray method is called
        swapArray(arrayBrands,0,4);

        //result should be 0 upon swap
        System.out.println("This is array index 0: " + arrayBrands[0]);

        //result should be 9 upon swap
        System.out.println("This is array index 4: " + arrayBrands[4]);


    }
}