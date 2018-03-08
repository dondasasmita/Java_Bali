package part_06.exercise04;

public class SubClass extends SuperClass {

    public static void main(String[] args) {

        //create an object of SubClass that can access the methods in SuperClass
        SubClass object = new SubClass();
        object.setName("Name in SuperClass");
        object.setDecimalNum(10.0);

        //object of SubClass calling 2 methods from SuperClass
        object.displayAllVariables();

        System.out.println("- - - - - - - - - - - ");

        object.displayAllVariableFiveTimes();


    }
}
