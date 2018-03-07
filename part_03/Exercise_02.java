package part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task. For instance, create a
 main() method, a multiply(int a, int b) method, and a divide(int a, int b) method. From the main method call the
 multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */

class Students {

    public void fullName (String first , String last) {
        System.out.println(first + " " + last);
    }

    public double calculateBMI (int weight , int height) {
        return (double) weight/height;
    }

    public static void main(String[] args) {

        Students student1 = new Students();
        student1.fullName("Bruno","Mars");
        System.out.println(student1.calculateBMI(100, 170));

    }
}
