package part_05.exercise02;

public class Controller {


    public static void main(String[] args) {

        Students donda = new Students();
        donda.Students("Donda","Yusuf",false);

        Students kezia = new Students();
        kezia.Students("Kezia","Euodia",true);


        Students danica = new Students();
        danica.Students("Danica", "Priest",true);

        Students kevin = new Students();
        kevin.Students("Kevin", "Graham", false);

        System.out.println("Total number of students in class : " + Students.totalNumofStudents);
        System.out.println("Total number of female students in class: " + Students.totalFemalesinClass);

    }
}
