package pl.marcinblok.controlStatements.iterationStatements.do_while;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        ---------do-while-----------

        do{
            instrukcje
        }while(warunek);

         */

        // Menu
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("To get help, choose one of the following:");
            System.out.println("1 - if");
            System.out.println("2 - switch");
            System.out.println("3 - while");
            System.out.println("4 - do-while");
            System.out.println("5 - for\n");
            choice = sc.nextInt();
        }while (choice < 1 || choice > 5);

        switch (choice){
            case 1 -> System.out.println("\"If instruction\"\nif(condition){\n\tinstruction;\n}else{\n\tinstruction;\n}");
            case 2 -> System.out.println("\"switch instruction\"\nswitch(expression){\n\tcase value_of_expression:\n\tinstructions;\n\tbreak;\n//...\ndefault:\n\tinstruction;\n}");
            case 3 -> System.out.println("\"while instruction\"\nwhile(condition){\n\tinstruction;\n}");
            case 4 -> System.out.println("\"do-while instruction\"\ndo{\n\tinstructions;\n}while(condition);");
            case 5 -> System.out.println("\"for instruction\"\nfor(inicialization; condition; iteration){\n\tinstruction;\n}");
        }
        sc.close();
    }
}
