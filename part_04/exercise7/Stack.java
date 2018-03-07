package part_04.exercise7;

import java.util.Arrays;

public class Stack {

    private char [] stackArray;
    private int stackSize;

    // sets stack (array index below 0) as empty
    private int topOfStack = -1;

    //constructor to create an array of char that takes in the size
    Stack (int size) {
        stackSize = size;
        stackArray = new char[size];
        Arrays.fill(stackArray, '*');
    }

    void push(char newChar) {
        if (topOfStack+1 < stackSize) {
            topOfStack ++;
            stackArray [topOfStack] = newChar;
        }
    }

    char pop() {
        return stackArray[topOfStack--];
    }

    void displayStack(int index) {
        if (index <= topOfStack){
            System.out.println(stackArray[index]);
        }
        else {
            System.out.println("empty");
        }

    }


}
