import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class ArraysExercises {

//    public static Person[] addPerson(String Person) {
//
//    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers[1]);

        Person[] people = {new Person(), new Person(), new Person()};
        people[0].setName("Tom");
        people[1].setName("Richard");
        people[2].setName("Harry");

//        for (int i = 0; i < people.length; i++) {
//        System.out.println(people[i]);

        for (Person name : people) {
            System.out.println(name);
        }

    }
}
