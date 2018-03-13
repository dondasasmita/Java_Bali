package part_11.exercise03_sample;

public class Employee {

    public String lastName;

    public String firstName;

    public Employee() {
    }

    public Employee(String last, String first) {
        this.lastName = last;

        this.firstName = first;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
