package part_13_extras.refugees.multi_threaded_application2;

public class MyThreadDemo {

    public static void main(String[] args) {

        String in1 = "/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/lyrics/part1.txt";
        String in2 = "/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/lyrics/part2.txt";
        String in3 = "/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/lyrics/part3.txt";
        String in4 = "/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/lyrics/part4.txt";
        String outPath = "/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/lyrics/theLyrics2.txt";

        MyThread thread1 = new MyThread(in1,outPath);
        MyThread thread2 = new MyThread(in2,outPath);
        MyThread thread3 = new MyThread(in3,outPath);
        MyThread thread4 = new MyThread(in4,outPath);

//        thread1.getThreadObj().start();
//        thread2.getThreadObj().start();
//        thread3.getThreadObj().start();
//        thread4.getThreadObj().start();

        thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();
    }
}
