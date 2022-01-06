import java.util.*;

public class ServerNameGenerator {
    public static String[] adjectives = {"charming", "cruel", "fantastic", "gentle", "huge", "perfect", "rough", "sharp", "tasty", "zealous"};
    public static String[] nouns = {"time", "year", "people", "way", "day", "man", "thing", "woman", "life", "child"};

    public static String randElement(String[] arr) {
        Random randGen = new Random();
        int randIndex = randGen.nextInt(arr.length);
        return arr[randIndex];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: \n" + randElement(adjectives) + "-" + randElement(nouns));
    }
}
