package part_06.exercise07;

public class DynDispDemo {

    public static void main(String args[]) {

        // creating object from all three classes
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        //creating reference of Sup class
        Sup supRef;

        //Pointing reference to an object and calling the method
        supRef = superOb;
        supRef.method();

        //Pointing reference to an object and calling the method
        supRef = subOb1;
        supRef.method();

        //Pointing reference to an object and calling the method
        supRef = subOb2;
        supRef.method();
    }

}
