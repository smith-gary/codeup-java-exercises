import java.util.Scanner;
public class Warmups {
    public static void main(String[] args) {
//        System.out.println("Java is statically type, while Javascript is dynamically typed.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What did yo ueat for breakfast today?");
        String userBreakfast = scanner.next();
        System.out.printf("I don't eat breakfast but %s sound(s) really good!", userBreakfast);

    }
}
