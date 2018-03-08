package part_06.exercise05;

public class SubClass extends SuperClass {

    private String nameInSubClass;
    private int numberInSubClass;
    private double decimalInSubClass;



    public SubClass(String nameInSubClass, int numberInSubClass, double decimalInSubClass) {
        this.nameInSubClass = nameInSubClass;
        this.numberInSubClass = numberInSubClass;
        this.decimalInSubClass = decimalInSubClass;
    }

    public String getNameInSubClass() {
        return nameInSubClass;
    }

    public void setNameInSubClass(String nameInSubClass) {
        this.nameInSubClass = nameInSubClass;
    }

    public int getNumberInSubClass() {
        return numberInSubClass;
    }

    public void setNumberInSubClass(int numberInSubClass) {
        this.numberInSubClass = numberInSubClass;
    }

    public double getDecimalInSubClass() {
        return decimalInSubClass;
    }

    public void setDecimalInSubClass(double decimalInSubClass) {
        this.decimalInSubClass = decimalInSubClass;
    }

    //attempt to overload the SubClass constructor above
    public SubClass(String name, int num){
        this.nameInSubClass = name;
        this.numberInSubClass = num;
    }

    //attempt to overload a method in SuperClass
    @Override
    public void displayAllVariables() {
        System.out.println(nameInSubClass);
        System.out.println(numberInSubClass);
    }

    public static void main(String[] args) {

        //creating an object to demonstrate overloading constructor in SubClass
        //object can be created without passing variables in the first subclass constructor perimeter
        //proof of overloading constructor
        SubClass object = new SubClass("Name SubClass", 10);


        //proof of overriding a method failed,
        object.displayAllVariables();

    }
}
