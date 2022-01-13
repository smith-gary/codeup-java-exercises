package groceries;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryListApp {
    public static void main(String[] args) {
        HashMap<String, ArrayList<GroceryItem>> storeItems = new HashMap<>();
        storeItems.put("Meat", new ArrayList<>());
        storeItems.put("Produce", new ArrayList<>());
        storeItems.put("Dairy", new ArrayList<>());
        storeItems.put("Home Goods", new ArrayList<>());
        Scanner sc = new Scanner(System.in);
        Input userContinue = new Input();
        System.out.println("Welcome!\n");
        System.out.println("1: Create a grocery list?");
        System.out.println("2: Exit");
        int listAnswer = sc.nextInt();
        if (listAnswer == 1) {
            System.out.println("Here are the categories to choose from: ");
            System.out.println(storeItems.keySet());
            System.out.println("You can type exit at anytime.");
            ArrayList<String> listItems = new ArrayList<>();
            do {
                System.out.println("Enter a category: \n");
                String catAnswer = sc.nextLine();

                switch (catAnswer) {
                    case "Home Goods":
                        System.out.println("What home goods would you like?");
                        String hgItem = sc.nextLine();
                        listItems.add(hgItem);
                        break;
                    case "Produce":
                        System.out.println("What produce would you like?");
                        String proItem = sc.nextLine();
                        listItems.add(proItem);
                        break;
                    case "Dairy":
                        System.out.println("What dairy product would you like?");
                        String dairyItem = sc.nextLine();
                        listItems.add(dairyItem);
                        break;
                    case "Meat":
                        System.out.println("What meat product would you like?");
                        String meatItem = sc.nextLine();
                        listItems.add(meatItem);
                        System.out.println("add more items? y/n");
                        if (sc.nextLine().equalsIgnoreCase("yes") || sc.nextLine().equalsIgnoreCase("y")) {

                        } else {
                            break;
                        }
                    default:
                        System.out.println("would you like to exit?");
                }
            } while (userContinue.yesNo("Continue?"));
            System.out.println(listItems);
        }
        System.out.println("Goodbye, and have a wonderful day!");
    }
}

