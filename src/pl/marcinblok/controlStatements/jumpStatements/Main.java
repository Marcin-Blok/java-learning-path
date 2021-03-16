package pl.marcinblok.controlStatements.jumpStatements;

public class Main {
    public static void main(String[] args) {


        /*

        -------break statement-------

         */

        // Displaying names of an array till find one starting with F, than quit
        String [] names = {"Ania", "Paulina", "Kuba", "Filip", "Jola", "Wojtek"};

        for (String name : names) {
            if (name.startsWith("F")) {
                break;
            }
            System.out.println(name + "\t");
        }




        // Counting values from an array, till sum of them is higher than 15.
        double [] values = {5.7, 4.9, 3.4, 1.8, 12.5, 2.2};
        double sumOfValues = 0;
        int numberOfIndex = 0;

        for (double value : values) {
            sumOfValues += value;
            numberOfIndex++;
            if (sumOfValues >= 15) {
                break;
            }
        }
        System.out.println("\nMax number of indexes added is " + numberOfIndex + " and total value of those indexes is: " + sumOfValues);
    }
}
