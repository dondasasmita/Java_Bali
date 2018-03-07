package part_04.exercise6;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */

class Queue {

    int q [];
    int putLoc , getLoc, size;

    public Queue (int size) {
        q = new int [size];
        this.size = size;
        putLoc = 0;
        getLoc = 0;
    }

    void putNumber(int num) {
       q [putLoc] = num;
       putLoc ++;
    }

     int getNumber(){
        if (getLoc == putLoc){
            return 0;
        }
        return q [getLoc++];
    }


}

