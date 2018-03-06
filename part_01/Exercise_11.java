package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {

        int minutesInAYear = 525600;
        int secondsInThreeYear = (minutesInAYear * 60) * 3;

        int peopleBornInThreeYears = secondsInThreeYear / 6;
        int peopleDieInThreeYears = secondsInThreeYear / 12;
        int peopleImmigrateInThreeYears = secondsInThreeYear /40;
        int currentPopulation = 380123456;

        int addPopulation = currentPopulation + peopleBornInThreeYears;
        int subtractPopulation = peopleDieInThreeYears + peopleImmigrateInThreeYears;

        System.out.println("Population in 3 years will be : " + (addPopulation - subtractPopulation));

    }

}