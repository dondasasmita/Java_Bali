package part_06.exercise05;

public class SuperClass {

    private String name;
    private double decimalNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDecimalNum() {
        return decimalNum;
    }

    public void setDecimalNum(double decimalNum) {
        this.decimalNum = decimalNum;
    }

    public void displayAllVariables () {
        System.out.println(getName());
        System.out.println(getDecimalNum());
    }

    public void displayAllVariableFiveTimes () {
        for (int i = 0 ; i <= 5 ; i++ ) {
            System.out.println(getName());
            System.out.println(getDecimalNum());
        }

    }
}
