package pl.marcinblok.controlStatements.conditionalStatements.switchStatement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        ------switch-----

        switch(wyrażenie){
        case (wartość wyrażenia 1):
            sekwencja instrukcji
            break;
        case(wartośćwyrażenia 2):
            sekwencja instrukcji
            break;
        .
        .
        .
        case (wartość wyrażenia N-ego)
            sekwencja instrukcji
            break;
        default:
            domyślny ciąg instrukcji

        }
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("-----Menu to choose from for the party------");
        System.out.println("1 - Pizza");
        System.out.println("2 - Spaghetti");
        System.out.println("3 - Burger");
        System.out.println("4 - Sushi");
        System.out.println("What's your choice?");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("You chose pizza...enjoy!");
                break;
            case 2:
                System.out.println("You chose Spaghetti...enjoy!");
                break;
            case 3:
                System.out.println("You chose Burger...enjoy!");
                break;
            case 4:
                System.out.println("You chose Sushi...enjoy!");
                break;
            default:
                System.out.println("You didn't choose anything of the menu...good luck");
        }
    }
}
