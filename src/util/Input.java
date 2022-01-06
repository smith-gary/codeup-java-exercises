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
        int userInput = scanner.nextInt();
        if (userInput <= max && userInput >= min) {
            return userInput;
        }
        System.out.println("Invalid input try again: ");
        return getInt(min, max);
    }
    public int getInt(String prompt) {
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        int max = 5;
        int min = 0;
        if (userInput <= max && userInput >= min) {
            return userInput;
        }
        System.out.println("Invalid input try again: ");
        return getInt(prompt);
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

    public double getDouble() {
        System.out.println("Enter a number between 1 and 10");
        double userInput = scanner.nextInt();
        double max = 10;
        double min = 1;
        if (userInput <= max && userInput >= min) {
            return userInput;
        }
        System.out.println("Invalid input try again: ");
        return getDouble();
    }


    public static void main(String[] args) {


    }
}
