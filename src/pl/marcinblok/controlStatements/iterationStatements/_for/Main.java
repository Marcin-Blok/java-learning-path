package pl.marcinblok.controlstatements.iterationStatements.forLoop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        /*
        ----------for-------------

            for(inicjalizacja; warunek; iteracja){
                ciało pętli
            }
        */
        int[] numbers = {22, 55, 12, 52, 15, 6, 8, 9, 3, 1, 2, 3, 4, 5, 100, 200, 300, 400, 500};

        System.out.println("Displaying an array values in order of adding using for loop");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + "\t");
        }
        System.out.println();


        /*
        ---------for-each----------

        for(typ zmiennej iteracyjnej : kolekcja){
            blok instrukcji
        }
         */

        System.out.println("\nDisplaying an array values using for-each loop");
        for (int element : numbers) {
            System.out.print(element + "\t");
        }


        // Summimg values
        System.out.println("\n \nSumming values of an array");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Sum of values equals: " + sum);

        //Sorting values
        System.out.println("\nSorting values of an array and displaying");
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
    }
}
