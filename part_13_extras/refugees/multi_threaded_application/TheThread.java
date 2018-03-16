package part_13_extras.refugees.multi_threaded_application;

import java.io.*;
import java.util.ArrayList;

public class TheThread implements Runnable {

    private Thread threadObj;
    private String inputPath;
    public BufferedReader in = null;
    private ArrayList <String> lines;

    public TheThread(String path) {
        this.threadObj = new Thread();
        this.inputPath = path;
        this.lines = new ArrayList<>();
    }

    public Thread getThreadObj() {
        return threadObj;
    }

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    public ArrayList<String> getLines() {
        return lines;
    }

    public void setLines(ArrayList<String> lines) {
        this.lines = lines;
    }

    @Override
    public void run() {
        System.out.println("running : " + threadObj.toString());
        try {
            //read the file
            in = new BufferedReader(new FileReader(getInputPath()));
            //variable to store the line read
            String line;
            //read line, if not empty add to the collections of lines (ArrayList)
            while ((line = in.readLine()) != null) {
                //add line to the String array lines
                getLines().add(line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    //    @Override
//    public void run() {
//        //takes a file from the path
//        try {
//            in = new BufferedReader( new FileReader(inputPath));
//            out = new BufferedWriter(new FileWriter(outputPath));
//            String line;
//            //read the line while it is not empty
//            while ((line = in.readLine()) != null) {
//                // write line to the file and check if the output file has line on it, if it has lines create new line and then write
//                try {
//                    out.newLine();
//                    out.write(line);
//                    } catch (IOException ioe) {
//                    ioe.printStackTrace();
//                }
//            }
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//        try {
//            in.close();
//            out.close();
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//
//    }
}
