package part_03.Exercise1;

class Beers extends Beverages {

    public Beers (int alcoholLevel, String brand) {
        alcoholLevel = 0;
        brand = "";
        super.isAlcoholic = true;
    }

    public void sip() {
        super.volume = volume - 10;
        System.out.println(super.volume);
    }

    public void bottomsUp() {
        super.volume = volume - volume;
        System.out.println(super.volume);
        System.out.println("Empty, one more!");
    }

}
