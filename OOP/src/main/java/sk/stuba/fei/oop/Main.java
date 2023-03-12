package sk.stuba.fei.oop;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println(self.compare(123,252));


//        while (true){
//
//            Scanner scanner = new Scanner(System.in);  // Create a Scanner object
//            System.out.println("Enter your born date (d m), if you want program to stop enter 'end':");
//            String date = scanner.nextLine();  // Read user input
//
//            if (Objects.equals(date, "end")){
//                break;
//            }
//
//            String[] splitedDate = date.split("\\s+");
//
//            System.out.println("Your sign is: " + horoskop(Integer.parseInt(splitedDate[0]), Integer.parseInt(splitedDate[1])));  // Output user input
//        }

        arraySort();

        //arrayInit();

        //arrayNumbers();

    }

    private static void arraySort(){
        int[] array = {12,214,12,2,24124,1,2414,29,214,98};
        for (int number : array)
            System.out.print(number + "; ");
        Arrays.sort(array);
        System.out.print( "\n ");
        for (int number : array)
            System.out.print(number + "; ");
    }

    private static void arrayInit(){
        String[] array = new String[] {"Toyota", "Mercedes", "BMW", "Volkswagen", "Skoda" };

        for (String car : array)
            System.out.print(car + "; ");

    }


    private static void arrayNumbers(){
        int[] array = new int[5];
        int i = 0;
        while (i < 5) {
            Scanner scanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter number to array on position:" + i);
            String input = scanner.nextLine();  // Read user input
            array[i] = Integer.parseInt(input);
            i++;
        }
        System.out.println("Loaded numbers to array! Displaying!\n");
        for (int number : array)
            System.out.print(number + "; ");
    }


    private static String horoskop(int day, int month) {

        if (month == 1) {
            if (day < 20)
                return "Capricorn";
            else
                return "Aquarius";
        } else if (month == 2) {
            if (day < 19)
                return "Aquarius";
            else
                return "Pisces";
        } else if (month == 3) {
            if (day < 21)
                return "Pisces";
            else
                return "Aries";
        } else if (month == 4) {
            if (day < 20)
                return "Aries";
            else
                return "Taurus";
        } else if (month == 5) {
            if (day < 21)
                return "Taurus";
            else
                return "Gemini";
        } else if (month == 6) {
            if (day < 21)
                return "Gemini";
            else
                return "Cancer";
        } else if (month == 7) {
            if (day < 23)
                return "Cancer";
            else
                return "Leo";
        } else if (month == 8) {
            if (day < 23)
                return "Leo";
            else
                return "Virgo";
        } else if (month == 9) {
            if (day < 23)
                return "Virgo";
            else
                return "Libra";
        } else if (month == 10) {
            if (day < 23)
                return "Libra";
            else
                return "Scorpio";
        } else if (month == 11) {
            if (day < 22)
                return "scorpio";
            else
                return "Sagittarius";
        } else if (month == 12) {
            if (day < 22)
                return "Sagittarius";
            else
                return "Capricorn";
        }

        return null;

    }

    private static int compare(int x, int y) {

        if (x > y) {
            return 1;
        }

        if (x == y) {
            return 0;
        }

        return -1;
    }
}