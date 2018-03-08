package part_06.exercise02;

public class SubClass extends SuperClass {

    private int num = 30;

    void displayVariablesubClass () {
        displayVariable();
        System.out.println("This is num in SubClass: " + num);
    }

    void changeNuminSuperClass() {
        setNumToChange(10);
    }
}
