package part_05.exercise01;

public class Country {

    private String officialLanguage;
    private int population;
    private int area;
    //to add String arrays that accept city object from getCity method

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public void setOfficialLanguage(String officialLanguage) {
        this.officialLanguage = officialLanguage;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int cityPopulation) {
        population += cityPopulation;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int cityArea) {
        area += cityArea;

    }


//    public String getCity (String city) {
//
//
//    }
}
