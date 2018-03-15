package part_13_extras.refugees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class RefugeesReader {

    public static void main(String[] args) {

        String path = "/Users/donda/Documents/CodingNomads/Labs/java_labs_bali/TestFiles/refugees_per_capita.csv";

        ArrayList<Refugees>  refugeeData = new ArrayList();

        try (FileReader fReader = new FileReader(path); BufferedReader bReader = new BufferedReader(fReader)){
            String currentLine;
            while ((currentLine = bReader.readLine()) != null) {
                String [] data = currentLine.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
                if (data.length < 5){
                    continue;
                }
                Refugees dataObj = new Refugees();
                dataObj.setYear(Integer.parseInt(data[1]));
                dataObj.setNameOfCountry(data[2]);
                try {
                    dataObj.setPopulation(Double.parseDouble(data[3]));
                } catch (Exception e){
                   continue;
                }
                dataObj.setNumOfRefugees(Double.parseDouble(data[4]));
                dataObj.setRefPerCapita(Double.parseDouble(data[5]));
                refugeeData.add(dataObj);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }

        //show results
        for (Refugees element : refugeeData) {
            System.out.println(element.toString());
        }

        System.out.println(" = = = = = = = = = = = = = = = ");

        // add total refugees in 2015
        double totalRefugees2015 = 0.0;
        for (int i = 0; i < refugeeData.size() ; i++) {
            if (refugeeData.get(i).getYear() == 2015) {
                totalRefugees2015 += refugeeData.get(i).getNumOfRefugees();
            }
        }
        System.out.println("Number of refugees in 2015 = " + NumberFormat.getNumberInstance(Locale.US).format((long) totalRefugees2015));

        System.out.println(" = = = = = = = = = = = = = = = ");

        //total population in 2015
        double population2015 = 0.0;
        for (int i = 0; i < refugeeData.size() ; i++) {
            if (refugeeData.get(i).getYear() == 2015) {
                population2015 += refugeeData.get(i).getPopulation();
            }
        }
        System.out.println("Population in 2015 = " + NumberFormat.getNumberInstance(Locale.US).format((long) population2015));

        System.out.println(" = = = = = = = = = = = = = = = ");

        //ratio of refugees : population in 2015
        System.out.println("Refugees to Population Ratio in 2015 :" + (totalRefugees2015/population2015)*100);


    }
}
