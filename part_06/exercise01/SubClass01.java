package part_06.exercise01;

public class SubClass01 extends SuperClass {

    private int num = 50;

    void displayVariableSubClass01(){
        displayVariable();
        System.out.println("This is num in SubClass01: " + num);
    }

    public static void main(String[] args) {

        SuperClass object1 = new SuperClass();
        object1.displayVariable();
        System.out.println(" ---- ");

        SubClass object2 = new SubClass();
        object2.displayVariablesubClass();
        System.out.println(" ---- ");

        SubClass01 object3 = new SubClass01();
        object3.displayVariableSubClass01();

    }
}
