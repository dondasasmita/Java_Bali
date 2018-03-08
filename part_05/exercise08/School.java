package part_05.exercise08;

public class School {

    static int totalNumOfItems;

    class Classrooms {

        int numOfTables;
        int numOfChairs;

        void addTable(int num) {
            this.numOfTables += num;
            School.totalNumOfItems += num;

        }

        void addChair(int num) {
            this.numOfChairs += num;
            School.totalNumOfItems += num;
        }

    }
    public static void main(String[] args) {

        School school1 = new School();
        school1.displayTotalItems();

    }

    void displayTotalItems (){

        Classrooms room1 = new Classrooms();
        room1.addChair(20);
        room1.addTable(10);

        System.out.println(School.totalNumOfItems);


    }

}
