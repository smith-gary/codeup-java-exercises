package movies;

import util.Input;

import java.util.Arrays;

import static movies.MoviesArray.findAll;

public class MoviesApplication {

    public static int displayMovie(int selection) {
        Movie[] test;
        MoviesArray showAll = new MoviesArray();
        test = showAll.findAll();
        for (Movie movie : test) {
            switch (selection) {
                case 1:
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                    break;
                case 2:
                    boolean animated = movie.getCategory().equals("animated");
                    if (animated) {
                        System.out.println(movie.getName());
                    }
                    break;
                case 3:
                    boolean drama = movie.getCategory().equals("drama");
                    if (drama) {
                        System.out.println(movie.getName());
                    }
                    break;
                case 4:
                    boolean horror = movie.getCategory().equals("horror");
                    if (horror) {
                        System.out.println(movie.getName());
                    }
                    break;
                case 5:
                    boolean scifi = movie.getCategory().equals("scifi");
                    if (scifi) {
                        System.out.println(movie.getName());
                    }
                    break;
                    case 6:
                    boolean musical = movie.getCategory().equals("musical");
                    if (musical) {
                        System.out.println(movie.getName());
                    }
                    break;
                    case 7:
                    boolean comedy = movie.getCategory().equals("comedy");
                    if (comedy) {
                        System.out.println(movie.getName());
                    }
                    break;
                default:
                    return 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Input viewing = new Input();
        boolean userContinue = true;
        do {
            int selection = viewing.getInt("Viewing options: \n 0: exit \n 1: view all \n 2: view animated \n 3: view drama \n 4: view horror \n 5: view scifi \n 6: view musical \n 7: view comedy \n Select one: ");
            displayMovie(selection);
            System.out.println("");
            userContinue = viewing.yesNo("Would you like to continue? (yes/no)");
        } while (userContinue);
    }
}
