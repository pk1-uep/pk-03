package pl.pk.hr.service;

import java.util.Scanner;

public class ReadService {

    private static Scanner console;

    static {
        console = new Scanner(System.in);
    }

    public static String readString(String prompt) {
        System.out.print(prompt);
        String line = console.nextLine();
        line = line.trim();
        String value = line;

        return value;
    }

    public static double readDouble(String prompt) {
        while (true) {
            // System.out.print(prompt);
            // String line = console.nextLine();
            // line = line.trim();
            String line = readString(prompt);
            try {
                double value = Double.parseDouble(line);
                return value;
            }
            catch (Exception ex) {
                System.out.println("Błąd! To nie jest liczba.");
            }
        }
    }

    public static int readInt(String prompt) {
        while (true) {
            // System.out.print(prompt);
            // String line = console.nextLine();
            // line = line.trim();
            String line = readString(prompt);
            try {
                int value = Integer.parseInt(line);
                return value;
            }
            catch (Exception ex) {
                System.out.println("Błąd! To nie jest liczba całkowita.");
            }
        }
    }

}
