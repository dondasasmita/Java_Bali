package part_06.exercise02;

public class SuperClass {

    private int num = 20;
    private int numToChange;

    //using getter and setter method to call/change the private variable above

    public int getNumToChange() {
        return numToChange;
    }
    public void setNumToChange(int numToChange) {
        this.numToChange += numToChange;
    }

    void displayVariable() {
        System.out.println("This is num in Superclass " + num);
    }

}
