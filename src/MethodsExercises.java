import java.util.Scanner;

public class MethodsExercises {
//    public static void add(int num1, int num2) {
//        System.out.println(num1 + num2);
//    }
//     public static void subtract(int num1, int num2) {
//        System.out.println(num1 - num2);
//    }
//     public static void multiply(int num1, int num2) {
//        System.out.println(num1 * num2);
//    }
//
//    public static void noAstrick(int num1, int num2) {
//        int result = 0;
//        for (int i = 1; i <= num1; i++) {
//            result += num2;
//        }
//            System.out.println(result);
//    }
//     public static int recMulti(int num1, int num2) {
//        if (num1 == 0 || num2 == 0) {
//            return 0;
//        } else {
//            int result = (num1 + recMulti(num1, num2 -1));
//            return result;
//        }
//
//    }
//
//     public static void divide(int num1, int num2) {
//        System.out.println(num1 / num2);
//    }
//      public static void modulus(int num1, int num2) {
//        System.out.println(num1 % num2);
//    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput <= max && userInput >= min) {
            return userInput;
        }
        System.out.println("Invalid input try again: ");
        return getInteger(1, 10);

    }

    public static void getFactorial(int min, int max) {
        boolean conFac = true;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();
            long factorialInput = 1;
            if (userInput <= max && userInput >= min) {
                System.out.print(userInput + "! = ");
                for (int i = userInput; i > 0; i--) {
                    factorialInput *= i;
                }
                System.out.println(factorialInput);
                System.out.println("would you like to continue?");
                conFac = sc.nextBoolean();
            } else {
                System.out.println("Invalid input try again: ");
                getFactorial(1, 10);
            }
        } while (conFac);

    }

    public static int randomRoll1(int die1) {
        int randomNum1 = (int) (Math.random() * die1);
        return randomNum1;
    }
    public static int randomRoll2(int die2) {
        int randomNum2 = (int) (Math.random() * die2);
        return randomNum2;
    }

    public static void diceRoll() {
        String roll = "";
        do {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides of the pair of dice: ");
        int die1 = sc.nextInt();
        int die2 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Roll the dice? y/n");
        roll = sc1.nextLine();
            if (roll.equalsIgnoreCase("y")) {
                System.out.println("Die 1: " + randomRoll1(die1) + " Die 2: " + randomRoll2(die2));
            }
        } while (roll.equalsIgnoreCase("y")) ;
    }



    public static void main(String[] args) {
//        add(5, 5);
//        subtract(10, 5);
//        multiply(5, 5);
//        noAstrick(5, 5);
//        System.out.println(recMulti(5, 5));
//        divide(10, 5);
//        divide(10, 0);
//        modulus(11, 5);

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println("Your number is within range!");
//        getFactorial(1, 10);

        diceRoll();

    }
}
