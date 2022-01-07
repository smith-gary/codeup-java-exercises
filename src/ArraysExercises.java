import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class ArraysExercises {

    private static void addPerson( Person people[], Person person) {
        Person newArr[] =  Arrays.copyOf(people, people.length + 1);
        System.out.println(newArr.length);
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == null) {
                newArr[i] = person;
                System.out.println(Arrays.toString(newArr));
            }
        }
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers[1]);

        Person[] people = {new Person(), new Person(), new Person()};
        people[0].setName("Tom");
        people[1].setName("Richard");
        people[2].setName("Harry");

        Person person1 = new Person("Bob");

        addPerson(people, person1);


//        for (int i = 0; i < people.length; i++) {
//        System.out.println(people[i]);

//        for (Person name : people) {
//            System.out.println(name);
//        }

    }


}
