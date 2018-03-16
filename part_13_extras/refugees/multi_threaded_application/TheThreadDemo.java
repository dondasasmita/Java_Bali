package part_13_extras.refugees.multi_threaded_application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TheThreadDemo {

    public static void main(String[] args) {

        String in1 = "/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/lyrics/part1.txt";
        String in2 = "/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/lyrics/part2.txt";
        String in3 = "/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/lyrics/part3.txt";
        String in4 = "/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/lyrics/part4.txt";
        String outPath = "/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/lyrics/theLyrics.txt";


        TheThread thread1 = new TheThread(in1);
        TheThread thread2 = new TheThread(in2);
        TheThread thread3 = new TheThread(in3);
        TheThread thread4 = new TheThread(in4);

        try {

            //write file to the path
            BufferedWriter out = new BufferedWriter(new FileWriter(outPath));

            //start the thread
            //question, why the start method cannot be called?
            thread1.run();
            thread2.run();
            thread3.run();
            thread4.run();

            //write the lines to the output file
            for (int i = 0; i < thread1.getLines().size() ; i++) {
                out.write(thread1.getLines().get(i).toString() + "\n");
            }

            for (int i = 0; i < thread2.getLines().size() ; i++) {
                out.write(thread2.getLines().get(i).toString() + "\n");
            }

            for (int i = 0; i < thread3.getLines().size() ; i++) {
                out.write(thread3.getLines().get(i).toString() + "\n");
            }

            for (int i = 0; i < thread4.getLines().size() ; i++) {
                out.write(thread4.getLines().get(i).toString() + "\n");
            }


            try {
                if (thread1.in != null && thread2.in != null && thread3.in != null && thread4.in != null) {
                    thread1.in.close();
                    thread2.in.close();
                    thread3.in.close();
                    thread4.in.close();
                }
                if (out != null) {
                    out.close();
                }
            }catch (IOException ioe) {
                ioe.printStackTrace();
            }

        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }
}
