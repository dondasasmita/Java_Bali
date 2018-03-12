package part_10.exercise02_1;

public class Demo {

    public static void main(String[] args) {

        // created objects of Hello and World Class
        Hello object1 = new Hello();
        World object2 = new World();

        //passing the objects of Hello and World class to the Thread class
        //created 2 objects of Thread class
        Thread name1 = new Thread(object1);
        Thread name2 = new Thread(object2);

        //calling run method from Hello and World class through start method from Thread class
        name1.start();
        name2.start();


    }
}
