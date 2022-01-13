package util;

import java.util.Scanner;
import java.util.*;


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

  public String getString(String prompt) {
      System.out.println(prompt);
      String userResponse = scanner.nextLine();
      return userResponse;
    }

    public boolean yesNo() {
        System.out.println("yes or no? ");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String answer = scanner.next();
        return answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d \n", min, max);
        String userInput = getString();
        try {
            if (Integer.valueOf(userInput) <= max && Integer.valueOf(userInput) >= min) {
                return Integer.valueOf(userInput);
            } else {
                System.out.println("Invalid input try again: \n");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Not a number, try again: \n");
        }
            return getInt(min, max);

    }

    public int getInt() {
        String userInput = getString("Enter a number.");
        try {
           return Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Not a number, try again: \n");
        }
        return getInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a number between 1 and 10");
        String userInput = getString();
        try {
            if (Double.valueOf(userInput) <= max && Double.valueOf(userInput) >= min) {
                return Double.valueOf(userInput);
            } else {
                System.out.println("Invalid input try again: \n");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Not a number, try again: \n");
        }
        return getDouble(min, max);
    }

    public double getDouble() {
        String userInput = getString("Enter a number between 1 and 10");
        try {
                return Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Not a number, try again: \n");
        }
        return getDouble();
    }

    public void getBinary() {
        System.out.println("Enter a binary number: ");
        String userInput = getString();
        try {
            System.out.println("Your number is " + Integer.parseInt(userInput, 2));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Not a binary number, try again: \n");
            getBinary();
        }
    }

    public void getHex() {
            System.out.println("Enter a hexidecimal number: ");
            String hexInput = getString();
            try {
                System.out.println("Your number is " + Integer.parseInt(hexInput, 16));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Not a hexidecimal number, try again: \n");
                getHex();
            }
        }
    }