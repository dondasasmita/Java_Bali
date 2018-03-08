package part_06.exercise03;

public class Class_03 extends Class_02 {

    private String nameClass03;
    private int numClass03;


    public Class_03(String nameClass01, int numberClass01, String nameClass02, int numClass02, String nameClass03, int numClass03) {
        super(nameClass01, numberClass01, nameClass02, numClass02);
        this.nameClass03 = nameClass03;
        this.numClass03 = numClass03;
    }

    public static void main(String[] args) {

        //create an object of Class 3
        Class_03 object = new Class_03("Name1",1,"Name2",2,"Name3",3);

        //setting name and num in Class 1 using getter and setter from Class 1
        object.setNameClass01("Name 01A");
        object.setNumberClass01(1+3);

        //proving the variable in Class 01 has been changed
        System.out.println("Name from Class 1: " + object.getNameClass01() + " | Number from Class 1:  "+ object.getNumberClass01());
    }
}
