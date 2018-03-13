package part_11.exercise03_answer;

import java.lang.reflect.Array;

public class Queue <E> {

    //create array that holds the queue
    E queue [];

    // create the put and get indices
    int putLoc, getLoc;

    //allocate memory for the queue pass type of array
    Queue (E [] array){
        queue = array;
        putLoc = getLoc = 0;
    }

    //create method to put element into the queue
    void put (E element){
        if (putLoc == queue.length) {
            System.out.println(" Queue is full....");
            return;
        }
        queue[putLoc ++] = element;
    }

    // create method to get element from the queue
    E get() {
        if (getLoc == putLoc) {
            System.out.println(" Queue is empty...");
            return null;
        }
        return queue[getLoc++];
    }

}
