package pl.marcinblok.streamsIO;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Tworzenie pliku o nazwie test.txt
        File file = new File("motto.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File " + file.getName() + " has been created");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("File: " + file.getName() + " already exists in location: " + file.getAbsolutePath());
        }


        //Utworzenie strumienia znakowego, zapis i odczyt z pliku

        Formatter formatter;
        Scanner userInput;
        Scanner readFile;
        if (file.canWrite()) {
            try (FileWriter fileWriter = new FileWriter(file, true)) {

                formatter = new Formatter(fileWriter);
                userInput = new Scanner(System.in);
                readFile = new Scanner(file);
                System.out.println("What is your life motto?");
                String userText = userInput.nextLine();
                formatter.format("%s \n", userText);
                formatter.close();

                System.out.println("File content:");
                while (readFile.hasNextLine()) {
                    System.out.println(readFile.nextLine());
                }

                userInput.close();
                readFile.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
