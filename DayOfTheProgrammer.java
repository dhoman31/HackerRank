/*
author@ Daniel Homan
17-05-2017

Day Of the Programmer occurs on the 256th day of the year .
In Russia, they switched to the Gregorian calender from the
Julain calender in 1918. After January 31st 1918, the next day
was February 14th. Find what date the Day Of the Programmer occurs
in Russia based on an inputted year.
 
*/
import java.util.Scanner;

public class DayOfTheProgrammer {
    static String solve(int year){
        int days = 0;
        if(year < 1919){
            if(year % 4 == 0){
                days = 29;
            }
            else{
                days = 28;
            }

            if(year == 1918){
                days = days - 13;
            }
        }

        if(year > 1918){
            if(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)){
                days = 29;
            }
            else{
                days = 28;
            }
        }

        int sum = 31 + days + 31 + 30 + 31 + 30 + 31 + 31;
        int date = 256-sum;
        return date+".09."+year;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
