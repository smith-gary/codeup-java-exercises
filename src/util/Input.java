package util;

import java.util.Scanner;


public class Input {

    private Scanner scanner = new Scanner(System.in);

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("yes or no? ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInteger(int min, int max) {
        System.out.println("Enter a number between 1 and 10");
        int userInput = scanner.nextInt();
        if (userInput <= max && userInput >= min) {
            return userInput;
        }
        System.out.println("Invalid input try again: ");
        return getInteger(min, max);

    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a number between 1 and 10");
        double userInput = scanner.nextInt();
        if (userInput <= max && userInput >= min) {
            return userInput;
        }
        System.out.println("Invalid input try again: ");
        return getDouble(min, max);
    }

    public static void main(String[] args) {


    }
}
