package org.example;

public class Methods {
    static double total;

    public static double basePrice(){
        total = 5.45;
        return Math.round(total * 100.0) / 100.0;
    }
    public static double youngBase(){
        System.out.println("You got the Student discount on your regular sandwich.");
        total = 5.45 - (5.45 * 0.1);
        return Math.round(total * 100.0) / 100.0;
    }
    public static double oldBase(){
        System.out.println("You got the senior discount on your regular sandwich.");
        total = 5.45 - (5.45 * 0.2);
        return Math.round(total * 100.0) / 100.0;
    }
    public static double largeBase(){
        total = 8.95;
        return Math.round(total * 100.0) / 100.0;
    }
    public static double youngLarge(){
        System.out.println("You got the Student discount on your large sandwich.");
        total = 8.95 - (8.95 * 0.1);
        return Math.round(total * 100.0) / 100.0;
    }
    public static double oldLarge(){
        System.out.println("You got the Senior discount on your large sandwich.");
        total = 8.95 - (8.95 * 0.2);
        return Math.round(total * 100.0) / 100.0;
    }
    public static void printTotal(){
        System.out.println("Your total is $" + (Math.round(total * 100.0) / 100.0));
    }
}
