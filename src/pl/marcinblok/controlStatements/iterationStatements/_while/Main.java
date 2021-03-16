package pl.marcinblok.controlStatements.iterationStatements._while;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        -------while--------

        while(warunek){
            ciało pętli
        }
         */

        // Counting down till blast
        int time = 10;
        while (time > 0) {
            System.out.println(time);
            time--;
            if (time == 0) {
                System.out.println("BOOM!");
            }
        }


        // Guesing random number
        System.out.println("\nLet's play....Guess number from 1-10");

        Random r = new Random();
        int randomNumber = r.nextInt(10) + 1;   // Range from 1 - 10 included

        Scanner sc = new Scanner(System.in);
        int myNumber;

        boolean condition = true;

        while (condition) {
            myNumber = sc.nextInt();
            if (myNumber == randomNumber) {
                System.out.println("Finally...you won!");
                condition = false;
            } else {
                System.out.println("Wrong, try again...");
            }

        }
        sc.close();

    }
}
