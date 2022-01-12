package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Student, String> students = new HashMap<>();
        Student stu1 = new Student("Bob", new ArrayList<>());
        Student stu2 = new Student("Patrick", new ArrayList<>());
        Student stu3 = new Student("Sandy", new ArrayList<>());
        Student stu4 = new Student("Mr", new ArrayList<>());

        stu1.addGrade(80);
        stu1.addGrade(70);
        stu1.addGrade(75);

        stu2.addGrade(70);
        stu2.addGrade(75);
        stu2.addGrade(60);

        stu3.addGrade(95);
        stu3.addGrade(85);
        stu3.addGrade(75);

        stu4.addGrade(100);
        stu4.addGrade(65);
        stu4.addGrade(83);

        students.put(stu1, "bob-sponge");
        students.put(stu2, "star-patrick");
        students.put(stu3, "squirrel-sandy");
        students.put(stu4, "crab-mr");

        Input userContinue = new Input();

        System.out.println("Welcome!\n");
        do {
            System.out.println("Here are the GitHub usernames of our students: \n");
            System.out.printf("|%s| |%s| |%s| |%s| \n", students.get(stu1), students.get(stu2), students.get(stu3), students.get(stu4));
            System.out.println();
            System.out.println("What student would you like to see more information on?");
            String userAnswer = sc.nextLine();
                switch (userAnswer) {
                    case "bob-sponge":
                        System.out.printf("Name: %s - gitHub Username: %s \n", stu1.getName(), students.get(stu1));
                        System.out.printf("Current Average: %f", stu1.getGradeAverage());
                        break;
                    case "star-patrick":
                        System.out.printf("Name: %s - gitHub Username: %s \n", stu2.getName(), students.get(stu2));
                        System.out.printf("Current Average: %f", stu2.getGradeAverage());
                        break;
                    case "squirrel-sandy":
                        System.out.printf("Name: %s - gitHub Username: %s \n", stu3.getName(), students.get(stu3));
                        System.out.printf("Current Average: %f", stu3.getGradeAverage());
                        break;
                    case "crab-mr":
                        System.out.printf("Name: %s - gitHub Username: %s \n", stu4.getName(), students.get(stu4));
                        System.out.printf("Current Average: %f", stu4.getGradeAverage());
                        break;
                    default:
                        System.out.println("Sorry, no student found with the GitHub username of " + userAnswer);
                }

        } while (userContinue.yesNo("\nWould you like to see another student?"));
        System.out.println("Goodbye, and have a wonderful day!");
    }
}

