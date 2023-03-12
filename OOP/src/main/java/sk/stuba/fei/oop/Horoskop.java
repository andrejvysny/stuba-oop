package sk.stuba.fei.oop;
import java.util.Scanner;  // Import the Scanner class

public class Horoskop {

    public static String horoskop(){

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your born date (m.Y):");

        String date = scanner.nextLine();  // Read user input
        System.out.println("Date is: " + date);  // Output user input

        return "";
    }



    public static String horoskop(int day, int month) {

        if (month == 1) {
            if (day < 20)
                return "Capricorn";
            else
                return "Aquarius";
        }
        else if (month == 2) {
            if (day < 19)
                return "Aquarius";
            else
                return "Pisces";
        }
        else if(month == 3) {
            if (day < 21)
                return "Pisces";
            else
                return "Aries";
        }
        else if (month == 4) {
            if (day < 20)
                return "Aries";
            else
                return "Taurus";
        }
        else if (month == 5) {
            if (day < 21)
                return "Taurus";
            else
                return "Gemini";
        }
        else if( month == 6) {
            if (day < 21)
                return "Gemini";
            else
                return "Cancer";
        }
        else if (month == 7) {
            if (day < 23)
                return "Cancer";
            else
                return "Leo";
        }
        else if( month == 8) {
            if (day < 23)
                return "Leo";
            else
                return "Virgo";
        }
        else if (month == 9) {
            if (day < 23)
                return "Virgo";
            else
                return "Libra";
        }
        else if (month == 10) {
            if (day < 23)
                return "Libra";
            else
                return "Scorpio";
        }
        else if (month == 11) {
            if (day < 22)
                return "scorpio";
            else
                return "Sagittarius";
        }
        else if (month == 12) {
            if (day < 22)
                return "Sagittarius";
            else
                return"Capricorn";
        }

        return null;

    }

}
