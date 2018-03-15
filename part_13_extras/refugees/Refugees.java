package part_13_extras.refugees;

public class Refugees {

    private int year;
    private String nameOfCountry;
    private double population;
    private double numOfRefugees;
    private double refPerCapita;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getNumOfRefugees() {
        return numOfRefugees;
    }

    public void setNumOfRefugees(double numOfRefugees) {
        this.numOfRefugees = numOfRefugees;
    }

    public double getRefPerCapita() {
        return refPerCapita;
    }

    public void setRefPerCapita(double refPerCapita) {
        this.refPerCapita = refPerCapita;
    }

    @Override
    public String toString() {
        return  "Year = " + getYear() +
                " | Country = " + getNameOfCountry() +
                " | Population = " + getPopulation() +
                " | Refugees = " + getNumOfRefugees() +
                " | Refugees per capita = " + getRefPerCapita();
    }
}
