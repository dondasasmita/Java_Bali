package part_07;

public class Demo {

    public static void main(String[] args) {

        //demonstrating object of SubClass03 to access the private variable in SuperClass
        SubClass03 objectSubClass3 = new SubClass03("Sub Class 3");
        objectSubClass3.setDecimalSupClass(15.1);
        System.out.println(objectSubClass3.getDecimalSupClass());

        // demonstrating object of SubClass01 to access private ArrayList in SuperClass
        SubClass01 object01 = new SubClass01("ABC Name");
        object01.setListOfWordsFromSubClass01(object01);

        // demonstrating object from SubClass02 to access private String variable in SubClass 1
        // using the super keyword in the SubClass02 constructor
        SubClass02 object2 = new SubClass02("SubClass");
        System.out.println(object2.nameFromSubClass01);

        // Using the super keyword in SubClass 3 by creating an object and pass the String name
        SubClass03 newObject = new SubClass03("This is name");
        System.out.println(newObject.nameFromSubClass01);


    }
}
