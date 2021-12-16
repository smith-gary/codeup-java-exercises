import java.util.Scanner;

public class StringExercise {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String firstOutput = "We don't need no education";

        System.out.println(firstOutput + "\n" + firstOutput.replace("education","thought control"));

        String secondOutput = "Check \"this\" out!, \"s inside of \"s!";

        System.out.println(secondOutput);

        String thirdOutput = "In windows, the main drive is usually C:\\";

        System.out.println(thirdOutput);

        String fourthOutput = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";

        System.out.println(fourthOutput);



    }
}
