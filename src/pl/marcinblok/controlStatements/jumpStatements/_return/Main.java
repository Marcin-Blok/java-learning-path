package pl.marcinblok.controlStatements.jumpStatements._return;

public class Main {
    public static void main(String[] args) {

        /*
        -------return statement------
         */

        int [] numbers = {64, 58, 16, 8, 33, 10, 4, 11, 91, 9, 27, 7, 11};
        for (int value : numbers) {
            if(value == 10){
                return;
            }
            System.out.print(value + "\t");
        }
    }
}
