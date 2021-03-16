package pl.marcinblok.controlStatements.jumpStatements._continue;

public class Main {
    public static void main(String[] args) {


    /*
    -------continue statement---------
     */

        // Displaying names apart from the one starting with J.
        String[] names = {"Jessie", "Ann", "Theodora", "Jennifer", "Monica", "Charles", "Joey", "Tom"};

        for (String name : names) {
            if (name.startsWith("J")) {
                continue;
            }
            System.out.println(name);
        }


        // Displaying even numbers only

        int[] numbers = new int[15];
        for (int i = 0; i < numbers.length; i++) {
            for (int value : numbers) {
                numbers[i] = i;
            }
            if (numbers[i] % 2 == 0) {
                continue;
            }
            System.out.print(numbers[i] + "\t");
        }
    }

}
