package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;

        System.out.println("Hello! Welcome to the Sandwich shop.");
        System.out.println("Would you like a number 1 or 2?");
        int size = s.nextInt();
        if (size != 2 && size != 1){
            System.out.println("Error: Invalid input. Please start over.");
        }
        else if (size == 1) {
            System.out.println("Great! One regular sandwich\nPlease enter your age: ");
            age = s.nextInt();
            if (age <= 17){
                Methods.youngBase();
            }
            else if (age >= 65) {
                Methods.oldBase();
            }
            else{
                Methods.basePrice();
            }

        }
        else if (size == 2) {
            System.out.println("Great! One large sandwich\nPlease enter your age: ");
            age = s.nextInt();
            if (age <= 17){
                Methods.youngLarge();
            }
            else if (age >= 65) {
                Methods.oldLarge();
            }
            else {
                Methods.largeBase();
            }
        }
        Methods.printTotal();

    }
}