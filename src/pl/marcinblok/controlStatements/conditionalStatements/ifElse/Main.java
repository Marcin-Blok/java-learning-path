package pl.marcinblok.controlStatements.conditionalStatements.ifElse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         /*
         ------if------

         if(warunek){
            instrukcj1
        }else{
            instrukcja2
         }

         -----If-else-if------

        if(warunek){
            instrukcj1
        }else if(warunek){
            instrukcja2
        }else{

        }
        */

        // Zonk game!!

        System.out.println("Choose the gate: 1, 2 or 3");
        Scanner sc = new Scanner(System.in);
        int gate = sc.nextInt();

        if (gate == 1) {
            System.out.println("You chose gate number " + gate + " your prise is.....one-week trip to the Seychelles!");
        } else if (gate == 2) {
            System.out.println("You chose gate number " + gate + "your win...a parachute jumping course :)");
        } else {
            System.out.println("You chose gate number " + gate + " you win...ZONK!! sorry mate, try again later");
        }

        // Zad. Sprawdź czy możesz spożywać alkohol.

        System.out.println("Provide your age");
        int age = sc.nextInt();

        if (age > 0) {
            if (age < 18) {
                System.out.println("You are " + age + " years old. \n That means, you are underage and can not drink alcohol.");
            } else {
                System.out.println("You are " + age + " years old. \n That means, you are an adult and can drink alcohol.");
            }
        } else {
            System.out.println("Age must be a positive value, higher than 0");
        }
    }
}
