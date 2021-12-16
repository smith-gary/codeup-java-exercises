import java.util.Scanner;

public class Bob {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String stillChatting = "";
        do {
        System.out.println("Say what you would like to Bob, be sure to use punctuation!?!");
        String userInput = sc.next();
            if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("You gonna take that from him?!?! Y/N");
            stillChatting = sc.next();
        } while (stillChatting.equalsIgnoreCase("n"));
    }
}
