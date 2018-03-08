package part_05.exercise03;

public class Iphone {

    private String name;
    private int nameWithNumber;
    private char nameWithChar;
    private int yearLaunched;


    void Iphone (int yearLaunched) {
        this.yearLaunched = yearLaunched;
    }

    void createName (String name){
         this.name = name;
    }

    void createName (int name){
        this.nameWithNumber = name;
    }

    void createName (char name){
        this.nameWithChar = name;
    }

    //possibly create display method that shows the year and model using different variables
    //override?

}
