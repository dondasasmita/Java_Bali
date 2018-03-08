package part_06.exercise02;

public class SubClass01 extends SuperClass {

    private int num = 50;

    void displayVariableSubClass01(){
        displayVariable();
        System.out.println("This is num in SubClass01: " + num);
    }

    public static void main(String[] args) {

        SubClass object2 = new SubClass();

        //adding 20 (change variable in superclass)
        object2.changeNuminSuperClass();
        object2.changeNuminSuperClass();

        //prove it has been changed
        System.out.println(object2.getNumToChange());

    }
}
