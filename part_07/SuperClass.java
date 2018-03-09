package part_07;


import java.util.ArrayList;

class SuperClass implements NewInterface {

    private int numSupClass;
    private String stringSupClass;
    private double decimalSupClass;
    private ArrayList <SubClass01> listOfWordsFromSubClass01 = new ArrayList<>();
    private long longNum;

    public int getNumSupClass() {
        return numSupClass;
    }

    public void setNumSupClass(int numSupClass) {
        this.numSupClass = numSupClass;
    }

    public String getStringSupClass() {
        return stringSupClass;
    }

    public void setStringSupClass(String stringSupClass) {
        this.stringSupClass = stringSupClass;
    }

    public double getDecimalSupClass() {
        return decimalSupClass;
    }

    public void setDecimalSupClass(double decimalSupClass) {
        this.decimalSupClass = decimalSupClass;
    }

    public ArrayList<SubClass01> getListOfWordsFromSubClass01() {
        return listOfWordsFromSubClass01;
    }

    public ArrayList<SubClass01> setListOfWordsFromSubClass01(SubClass01 object) {
        listOfWordsFromSubClass01.add(object);
        return listOfWordsFromSubClass01;
    }

    public void method1(){
        System.out.println("Method 1 implemented from Interface");
    }

    public void method2(){
        System.out.println("Method 2 implemented from Interface");
    }

    public void method3(){
        System.out.println("Method 3 implemented from Interface");
    }



}
