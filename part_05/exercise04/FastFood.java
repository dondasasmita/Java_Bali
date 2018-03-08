package part_05.exercise04;

public class FastFood {

    private String brandname;
    private int numOfChain;
    private double rating;
    private boolean isHalal = true;

    public FastFood(String brandname, int numOfChain, double rating, boolean isHalal) {
        this.brandname = brandname;
        this.numOfChain = numOfChain;
        this.rating = rating;
        this.isHalal = isHalal;
    }

    public FastFood(String brandname, int numOfChain, double rating) {
        this.brandname = brandname;
        this.numOfChain = numOfChain;
        this.rating = rating;
    }

    public FastFood(String brandname, double rating, boolean isHalal) {
        this.brandname = brandname;
        this.rating = rating;
        this.isHalal = isHalal;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public int getNumOfChain() {
        return numOfChain;
    }

    public void setNumOfChain(int numOfChain) {
        this.numOfChain = numOfChain;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isHalal() {
        return isHalal;
    }

    public void setHalal(boolean halal) {
        isHalal = halal;
    }

    public void displayFastFood() {
        System.out.println("Brand Name: " + getBrandname());
        System.out.println("Numbers of Chain: " + getNumOfChain());
        System.out.println("Rating: " + getRating());
        if (isHalal) {
            System.out.println("Halal Certified");
        }
        else {
            System.out.println("Non-Halal");
        }
    }
}
