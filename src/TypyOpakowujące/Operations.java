package TypyOpakowujące;
import ZapisOdczyt.Company;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
public class Operations {
    private static final String FILE_NAME = "numbers.txt";
    private static final int READ_FROM_USER = 1;
    private static final int READ_FROM_FILE = 2;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Wprowadzenie danych do pliku: " + READ_FROM_USER);
        System.out.println("Wprowadzenie danych do pliku: " + READ_FROM_FILE);
        int sc = scanner.nextInt();
        int sc2 = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < sc2; i++) {
            if (sc == READ_FROM_USER) {
                System.out.println("Wprowadź liczbę");
                int sc1 = scanner.nextInt();
                writeFile(sc1);
            }
            if (sc == READ_FROM_FILE) {
                try {
                    int numbers = readFile();
                    System.out.println(numbers);
                } catch (IOException | ClassNotFoundException e) {
                    System.err.println("Błąd odczytu danych");
                }
            }
        }

    }
    private static int readFile() throws IOException, ClassNotFoundException {
        try (
                var ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
        ) {
            return (int) ois.readObject();
        }
    }

    private static void writeFile(int i) {
        try (
                var oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
        ) {
            oos.writeObject(i);
            System.out.println("Zapisano dane do pliku");
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
        }

    }
}
