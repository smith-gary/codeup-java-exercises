package warmups;

import java.util.Scanner;
public class Warmups {

    public static String startDay() {
        return "Brain loading... Done!";
    }


    public static void main(String[] args) {
//        System.out.println("Java is statically type, while Javascript is dynamically typed.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What did you eat for breakfast today?");
        String userBreakfast = scanner.next();
        System.out.printf("I don't eat breakfast but %s sound(s) really good!", userBreakfast);
        System.out.println();
        System.out.println(startDay());

    }
}

