import java.util.Scanner;

public class ControlFlowExercises {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int i = 5;
        while(i <= 15) {
            System.out.printf("%d ", i);
            i++;
        }

        int a = 0;
        do {
            System.out.printf("%d%n", a);
            a+=2;
        } while (a <= 100);

        int b = 100;
        do {
            System.out.printf("%d%n", b);
            b-=5;
        } while (b >= -10);

        long c = 2;
        do {
            System.out.printf("%d%n", c);
            c*=c;
        } while (c < 1000000);


        for (int d = 0; d <= 100;) {
            System.out.printf("%d%n", d);
            d+=2;
        }

         for (int e = 100; e >= -10;) {
            System.out.printf("%d%n", e);
            e-=5;
        }

         for (long f = 2; f <= 1000000;) {
            System.out.printf("%d%n", f);
            f*=f;
        }

        for (int g = 1; g <=100; g++) {
            if (g % 5 == 0 && g % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (g % 5 == 0) {
                System.out.println("Buzz");
            } else if (g % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(g);
            }
        }

        System.out.println("What number would you like to go up to?");
        long userInput = sc.nextInt();

        System.out.println("Here is your table!");
        System.out.println("number\t| squared\t| cubed");
        System.out.println("------\t| -------\t| -----");
        for (long h = 1; h <= userInput; h++) {
            long squaredOutput = h * h;
            long cubedOutput = h * squaredOutput;
            if (squaredOutput >= 10 && cubedOutput >= 10) {
                System.out.printf("%-8d| %-10d| %-8d %n", h, squaredOutput, cubedOutput);
            } else {
                System.out.printf("%-8d| %-10d| %-10d %n", h, squaredOutput, cubedOutput);
            }

        }

        String continueAnswer = "";

       do  {
           System.out.println("Enter numerical grade between 0 and 100");

           int numGrade = sc.nextInt();

           if (numGrade <= 100 && numGrade >= 88) {
               System.out.println("A");
           } else if (numGrade <= 87 && numGrade >= 80) {
               System.out.println("B");
           } else if (numGrade <= 79 && numGrade >= 67) {
               System.out.println("C");
           } else if (numGrade <= 66 && numGrade >= 60) {
               System.out.println("C");
           } else {
               System.out.println("F");
           }
           System.out.println("Continue? Y/N");
           continueAnswer = sc.next();
       } while (continueAnswer.equalsIgnoreCase("Y"));

    }
}
