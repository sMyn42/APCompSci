package base.mathexercises;

/*
Programmer: Saketh Mynampati
Date: 9-25-2020
Assignment for Math Based Methods.
 */

public class MathEx {
    public static int swap(int x){
        int tens = x % 100 / 10;
        int ones = x % 10;
        int prefix = x / 100;
        return prefix*100 + tens + ones*10;

    }

    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int waitTime = depHour * 60 + depMin - curHour * 60 - curMin;
        int waitHour = waitTime / 60;
        int waitMin = waitTime % 60;

        System.out.println("You will have to wait " + waitHour + " hours and " + waitMin + " minutes.");
    }

    /**
     * Takes in the first date of the year and a date in the month of January, returns the day of the week that date falls on (0-6).
     * @param newYrDay Integer from 0 (Sunday) to 6 (Saturday) that denotes the day of the week of Jan 1st.
     * @param date is an integer that denotes a date in January.
     */
    public static int dayOfWeek(int newYrDay, int date){
        return ((date - 1) % 7 + newYrDay) % 7 ;

    }
}
