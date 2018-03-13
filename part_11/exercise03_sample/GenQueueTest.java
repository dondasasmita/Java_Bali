package part_11.exercise03_sample;

public class GenQueueTest {

    public static void main(String[] args) {
        GenQueue<Employee> empList;
        empList = new GenQueue<Employee>();

        GenQueue<HourlyEmployee> hList;
        hList = new GenQueue<HourlyEmployee>();
        hList.enqueue(new HourlyEmployee("T", "D"));
        hList.enqueue(new HourlyEmployee("G", "B"));
        hList.enqueue(new HourlyEmployee("F", "S"));

        empList.addItems(hList);

        while (empList.hasItems()) {
            Employee emp = empList.dequeue();
            System.out.println(emp.firstName + " " + emp.lastName);
        }
    }

}
