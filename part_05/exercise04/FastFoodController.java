package part_05.exercise04;

public class FastFoodController {

    public static void main(String[] args) {

        FastFood kfc = new FastFood("Kentucky Fried Chicken",178,8.8,true);
        FastFood warung = new FastFood("Warung Coding Nomads",1,2.2); //unidentified Halal bug
        FastFood somePizza = new FastFood("Pizza Hot",7.5,false);

        kfc.displayFastFood();
        System.out.println("----");
        warung.displayFastFood();
        System.out.println("----");
        somePizza.displayFastFood();

    }
}
