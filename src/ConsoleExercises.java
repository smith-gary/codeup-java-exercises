import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

//        System.out.println("The value of pi is approximately " + pi + ".");
//        System.out.printf("The value of pi is approximately %.2f.", pi);

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter a whole number: ");
//        int userInput = scanner.nextInt();
//        System.out.println("Enter three words: ");
//        String firstInput = scanner.next();
//        String secondInput = scanner.next();
//        String thirdInput = scanner.next();
//
//        System.out.format("You entered: \n %s \n %s \n %s", firstInput, secondInput, thirdInput);

//        System.out.println("Enter a sentence...");
////        String sentenceInput = scanner.next();
//        String sentenceInput = scanner.nextLine();
//
//        System.out.format("Here is your sentence: \n %s", sentenceInput);System.out.println("Enter a sentence...");
//
        System.out.println("Enter the length and width of your room: ");
        String lengthInput = scanner.nextLine();
        String widthInput = scanner.nextLine();
        int convertedLength = Integer.parseInt(lengthInput);
        int convertedWidth = Integer.parseInt(widthInput);

        System.out.println(convertedLength * convertedWidth + " is the area of your room and " + ((convertedLength * 2) + (convertedWidth * 2)) + " is the perimeter of your room." );

    }
}
