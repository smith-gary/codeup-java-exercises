import java.util.Scanner;

public class HighLow {

    public static int randomNumber() {
        int randNum =  (int) (Math.random() * 100);
        return randNum;
    }

    public static int validateNumber(int min, int max) {

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        }
        System.out.println("Not within range, try again: ");
        return validateNumber(1, 100);
    }

    public static void compareInput(int randomNum, int userNum) {
    Scanner sc1 = new Scanner(System.in);
            if (userNum < randomNum) {
                System.out.println("HIGHER");
                System.out.println("Guess a number 1 - 100: ");
//                validateNumber(1, 100);
                int newGuess = sc1.nextInt();
                compareInput(randomNum, newGuess);
            } else if (userNum > randomNum) {
                System.out.println("LOWER");
                System.out.println("Guess a number 1 - 100: ");
//                validateNumber(1, 100);
                int newGuess = sc1.nextInt();
                compareInput(randomNum, newGuess);
            } else {
                System.out.println("GOOD GUESS!");
            }
    }

    public static void main(String[] args) {
        // generate random number 1 - 100
         int randNum = randomNumber();
        System.out.println(randNum);
        // prompt user to guess number
        System.out.println("Guess a number 1 - 100: ");
        // validate user input
        int userInput = validateNumber(1, 100);
        // compare user input, if lower than random generated number output "HIGHER" and vice versa
        // if user input is correct output "GOOD GUESS"
        compareInput(randNum, userInput);
    }
}
