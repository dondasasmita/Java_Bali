package part_03;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/

class Beverages {

    int volume;
    boolean isAlcoholic;

}

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

class Controller {

    public static void main(String[] args) {

        Beers beer1 = new Beers(5, "Bintang");
        beer1.volume = 100;
        beer1.sip();
        beer1.bottomsUp();

    }

}