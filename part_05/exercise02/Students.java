package part_05.exercise02;

public class Students {

    public static int totalNumofStudents;
    public static int totalFemalesinClass;
    private String firstName;
    private String lastName;
    private boolean isFemale;

    void Students(String firstName, String lastName, boolean isFemale ) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.isFemale = isFemale;
            if (isFemale){
                this.totalFemalesinClass++;
            }
            totalNumofStudents++;
    }



//    public int getTotalNumofStudents() {
//        return totalNumofStudents;
//    }
//
//    public void setTotalNumofStudents(int totalNumofStudents) {
//        this.totalNumofStudents += totalNumofStudents;
//    }

//    public void addStudent() {
//        setTotalNumofStudents(1);
//    }

//    public int getTotalFemalesinClass() {
//        return totalFemalesinClass;
//    }

}
