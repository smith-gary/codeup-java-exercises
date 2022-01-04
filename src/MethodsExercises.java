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
        String conFac = "";
        do {
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();
            long factorialInput = 1;
            if (userInput <= max && userInput >= min) {
                System.out.println(userInput);
                for (int i = userInput; i > 0; i--) {
                    factorialInput *= i;
                }
                System.out.println(factorialInput);
                System.out.println("would you like to continue?");
                conFac = sc.nextLine();
            } else {
                System.out.println("Invalid input try again: ");
                getFactorial(1, 10);
            }
        } while (conFac.equalsIgnoreCase("y"));

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
        System.out.print("Enter a number between 1 and 10: ");
        getFactorial(1, 10);


    }
}
