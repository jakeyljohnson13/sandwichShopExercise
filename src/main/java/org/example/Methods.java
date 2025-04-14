package org.example;
import java.util.Scanner;

public class Methods {
    static Scanner m = new Scanner(System.in);
    static double total;
    static String isLoaded;

    public static double basePrice(){
        System.out.println("Would you like you to upgrade to a loaded sandwich (Y/N) for $1?");
        isLoaded = m.nextLine();
        if (isLoaded.equals("N")){
            total = 5.45;
        }
        else if (isLoaded.equals("Y")) {
            total = 6.45;
        }
        else{
            System.out.println("Invalid Input.");
        }
        return Math.round(total * 100.0) / 100.0;
    }
    public static double youngBase(){
        System.out.println("Would you like you to upgrade to a loaded sandwich (Y/N) for $1?");
        isLoaded = m.nextLine();
        if (isLoaded.equals("N")) {
            System.out.println("You got the Student discount on your regular sandwich.");
            total = 5.45 - (5.45 * 0.1);
        }
        else if (isLoaded.equals("Y")) {
            System.out.println("You got the Student discount on your regular sandwich.");
            total = 6.45 - (6.45 * 0.1);
        }
        else {
            System.out.println("Invalid Input");
            return 0;
        }
        return Math.round(total * 100.0) / 100.0;
    }
    public static double oldBase(){
        System.out.println("Would you like you to upgrade to a loaded sandwich (Y/N) for $1?");
        isLoaded = m.nextLine();
        if (isLoaded.equals("N")) {
            System.out.println("You got the Student discount on your regular sandwich.");
            total = 5.45 - (5.45 * 0.2);
        }
        else if (isLoaded.equals("Y")) {
            System.out.println("You got the Student discount on your regular sandwich.");
            total = 6.45 - (6.45 * 0.2);
        }
        else {
            System.out.println("Invalid Input");
            return 0;
        }
        return Math.round(total * 100.0) / 100.0;
    }
    public static double largeBase(){
        System.out.println("Would you like you to upgrade to a loaded sandwich (Y/N) for $1?");
        isLoaded = m.nextLine();
        if (isLoaded.equals("N")){
            total = 8.95;
        }
        else if (isLoaded.equals("Y")) {
            total = 9.95;
        }
        else{
            System.out.println("Invalid Input.");
            return 0;
        }
        return Math.round(total * 100.0) / 100.0;
    }
    public static double youngLarge(){
        System.out.println("Would you like you to upgrade to a loaded sandwich (Y/N) for $1?");
        isLoaded = m.nextLine();
        if (isLoaded.equals("N")) {
            System.out.println("You got the Student discount on your regular sandwich.");
            total = 8.95 - (8.95 * 0.1);
        }
        else if (isLoaded.equals("Y")) {
            System.out.println("You got the Student discount on your regular sandwich.");
            total = 9.95 - (9.95 * 0.1);
        }
        else {
            System.out.println("Invalid Input");
            return 0;
        }
        return Math.round(total * 100.0) / 100.0;
    }
    public static double oldLarge(){
        System.out.println("Would you like you to upgrade to a loaded sandwich (Y/N) for $1?");
        isLoaded = m.nextLine();
        if (isLoaded.equals("N")) {
            System.out.println("You got the Senior discount on your regular sandwich.");
            total = 8.95 - (8.95 * 0.2);
        }
        else if (isLoaded.equals("Y")) {
            System.out.println("You got the Student discount on your regular sandwich.");
            total = 9.95 - (9.95 * 0.2);
        }
        else {
            System.out.println("Invalid Input");
            return 0;
        }
        return Math.round(total * 100.0) / 100.0;
    }
    public static void printTotal(){
        System.out.println("Your total is $" + (Math.round(total * 100.0) / 100.0));
    }
}
