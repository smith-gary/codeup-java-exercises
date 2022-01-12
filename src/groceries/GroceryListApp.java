package groceries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static groceries.GroceryList.getList;

public class GroceryListApp {
    public static void main(String[] args) {
        HashMap<GroceryItem, String> storeItems = new HashMap<>();
        GroceryItem soup = new GroceryItem("Soup", "canned");
        GroceryItem steak = new GroceryItem("Steak", "meat");
        GroceryItem onion = new GroceryItem("Onion", "vegetable");
        GroceryItem avocado = new GroceryItem("Avocado", "fruit");
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(soup);
        groceryList.add(steak);
        groceryList.add(onion);
        groceryList.add(avocado);
        storeItems.put(soup, "Chicken Noodle Soup");
        storeItems.put(steak, "Ribeye");
        storeItems.put(onion, "Yellow Onion");
        storeItems.put(avocado, "Haas Avocado");
        System.out.println(storeItems.get(steak));
        System.out.println(storeItems.keySet());


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Would you like to create a grocery list?");
//        String createListAnswer = sc.nextLine();
//        System.out.println("Would you like to enter a new item?");
//        String newItemAnswer = sc.nextLine();
        System.out.println("Here are the categories to choose from: ");
        for (GroceryItem item : groceryList) {
            System.out.println(item.getCategory());
        }
        String categoryAnswer = sc.nextLine();
        switch (categoryAnswer) {
            case "canned":
                System.out.println();

        }
        System.out.println("Please enter the name of the item: ");
        String itemAnswer = sc.nextLine();
        System.out.println("Please enter the quantity: ");
        int itemNumber = sc.nextInt();
        System.out.println("Would you like to add another item or checkout?");
        String finalAnswer = sc.nextLine();


    }
}
