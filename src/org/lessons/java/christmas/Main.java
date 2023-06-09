package org.lessons.java.christmas;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String FILE_PATH = "./giftlist.txt";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> giftList = new ArrayList<>();

        boolean stop = false;

        do {
            System.out.print("Inserisci il nome del regalo: ");
            String gift = scan.nextLine();
            giftList.add(gift);
            System.out.println("Lunghezza della lista: " + giftList.size());

            System.out.print("Vuoi continuare ad aggiungere regali? (S/N): ");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("N")) {
                stop = true;
            }

        } while (!stop);

        scan.close();

        Collections.sort(giftList);

        System.out.println("Lista dei regali ordinata:");
        for (String gift : giftList) {
            System.out.println(gift);
        }

        FileWriter writer;
        try {
            writer = new FileWriter(FILE_PATH);

            for (String s : giftList) {
                writer.write(s + "\n");
            }

        } catch (IOException e) {
            System.out.println("Unable to write file");
        }

        try (Scanner reader = new Scanner(new File(FILE_PATH))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
