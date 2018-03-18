package part_13_extras.refugees.multi_threaded_application2;

import java.util.ArrayList;
import java.io.*;

public class MyThread implements Runnable {

    // thread object(target)
    private Thread threadObj;
    // input path
    private String inputPath;
    //output path
    private String outputPath;
    //Reader and writer
    private BufferedReader in = null;
    private BufferedWriter out = null;
    //arrayList to store all the lines upon reading the file
    private ArrayList<String> lines;

    //MyThread constructor that takes in the input and output path
    public MyThread(String inpath, String outpath) {
        this.threadObj = new Thread();
        this.inputPath = inpath;
        this.outputPath = outpath;
        this.lines = new ArrayList<>();
    }


    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    public BufferedReader getIn() {
        return in;
    }

    public void setIn(BufferedReader in) {
        this.in = in;
    }

    public BufferedWriter getOut() {
        return out;
    }

    public void setOut(BufferedWriter out) {
        this.out = out;
    }

    public ArrayList<String> getLines() {
        return lines;
    }

    public void setLines(ArrayList<String> lines) {
        this.lines = lines;
    }

    public Thread getThreadObj() {
        return threadObj;
    }

    public void setThreadObj(Thread threadObj) {
        this.threadObj = threadObj;
    }

    @Override
    public void run() {
        try {
            System.out.println("running : " + getThreadObj().toString());

            //read file from the given path
            in = new BufferedReader(new FileReader (getInputPath()));

            //write into a given filepath and add (append) on the new line.
            out = new BufferedWriter(new FileWriter(getOutputPath(),true));


            //put everyline on lines Arraylist
            String line;
            while ((line = in.readLine()) != null) {
                getLines().add(line);
            }

            //write the lines to a given file/path
            //to check for a method that does not overwrite the file, instead opening the file and write on a new line
            for (int i = 0; i < getLines().size() ; i++) {
                out.write(getLines().get(i).toString() +"\n");
            }

            //close all connections
            if (in != null){
                in.close();
            }

            if (out != null){
                out.close();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
