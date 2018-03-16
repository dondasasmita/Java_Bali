package part_13_extras.refugees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class RefugeesReader {

    public static void main(String[] args) {

        //path to the folder that contains the csv data
        String path = "/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/refugees_per_capita.csv";

        //created ArrayList to store the data objects
        ArrayList<Refugees> refugeeData = new ArrayList();

        //
        try (FileReader fReader = new FileReader(path); BufferedReader bReader = new BufferedReader(fReader)) {
            String currentLine;
            //read the line and while it is not empty
            while ((currentLine = bReader.readLine()) != null) {
                //created an array of String data from currentLine above and split by comma (ignoring the empty spaces)
                String[] data = currentLine.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
                // if data array is less than 5, ignore and continue next statements
                if (data.length < 5) {
                    continue;
                }
                //created object in Refugees class and set the private variables (year, country, etc)
                Refugees dataObj = new Refugees();
                //calling setter method from Refugees class and parse to its corresponding data type
                dataObj.setYear(Integer.parseInt(data[1]));
                dataObj.setNameOfCountry(data[2]);
                //some datas at index 3 (populations) are null, skipped using try catch
                try {
                    dataObj.setPopulation(Double.parseDouble(data[3]));
                } catch (Exception e) {
                    continue;
                }
                dataObj.setNumOfRefugees(Double.parseDouble(data[4]));
                dataObj.setRefPerCapita(Double.parseDouble(data[5]));
                //add the object to the arraylist refugeeData (above)
                refugeeData.add(dataObj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //show results calling the to String method from Refugee class
//        for (Refugees element : refugeeData) {
//            System.out.println(element.toString());
//        }


        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter year -->> ");
        int year = userInput.nextInt();

        System.out.println(" = = = = = = = = = = = = = = = ");

        // add total refugees
        double totalRefugees = 0.0;
        for (int i = 0; i < refugeeData.size(); i++) {
            if (refugeeData.get(i).getYear() == year) {
                totalRefugees += refugeeData.get(i).getNumOfRefugees();
            }
        }
        System.out.println("Number of refugees in " + year + " = " + NumberFormat.getNumberInstance(Locale.US).format((long) totalRefugees));

        System.out.println(" = = = = = = = = = = = = = = = ");

        //total population
        double population = 0.0;
        for (int i = 0; i < refugeeData.size(); i++) {
            if (refugeeData.get(i).getYear() == year) {
                population += refugeeData.get(i).getPopulation();
            }
        }
        System.out.println("Population in " + year + " = " + NumberFormat.getNumberInstance(Locale.US).format((long) population));

        System.out.println(" = = = = = = = = = = = = = = = ");

        //ratio of refugees : population
        System.out.println("Refugees to Population Ratio in " + year + " :" + (totalRefugees / population) * 100);

        System.out.println(" = = = = = = = = = = = = = = = ");

        //sort by country

//        System.out.println("Enter a country : ");
//        String country = userInput.nextLine();
//        System.out.println("Enter the year : ");
//        int year1 = userInput.nextInt();
//
//        for (int i = 0; i < refugeeData.size(); i++) {
//            if (refugeeData.get(i).getNameOfCountry() == country && refugeeData.get(i).getYear() == year1) {
//                System.out.println("Total population in " + year1 + " = " + refugeeData.get(i).getPopulation());
//                System.out.println("Number of Refugee in " + year1 + " = " + refugeeData.get(i).getNumOfRefugees());
////                System.out.println("Refugees to Population Ratio in " + year + " = " + (totalRefugees/population)*100);
//            }
//        }

    }
}

