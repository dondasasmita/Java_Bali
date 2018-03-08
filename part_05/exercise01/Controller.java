package part_05.exercise01;

public class Controller {

    public static void main(String[] args) {

        City denpasar = new City();
        City jakarta = new City();

        denpasar.setLocalLanguage("Balinese");
        denpasar.setPopulation(788445);
        denpasar.setTotalArea(123);

        jakarta.setLocalLanguage("Bahasa Indonesia");
        jakarta.setPopulation(9607000);
        jakarta.setTotalArea(661);

        Country indonesia = new Country();
        indonesia.setOfficialLanguage("Bahasa Indonesia");

        indonesia.setPopulation(jakarta.getPopulation());
        indonesia.setPopulation(denpasar.getPopulation());

        indonesia.setArea(jakarta.getTotalArea());
        indonesia.setArea(denpasar.getTotalArea());

        System.out.println("Total population in Indonesia is " + indonesia.getPopulation() + " people.");
        System.out.println("Total area in Indonesia is " + indonesia.getArea() + " sq km.");
        System.out.println("The official Language is " + indonesia.getOfficialLanguage());

    }

}
