package exercise.java.collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Ross", "Geller", 29));
        users.add(new User("Allan", "Smith", 30));
        users.add(new User("Monica", "Geller", 13));
        users.add(new User("Joey", "Tribiani", 15));

        System.out.println("****** Before sorting ******");
        printList(users);

        // sort by firstName using Comparable interface.
        Collections.sort(users);
        System.out.println("\n****** Sort by firstName using Comparable interface ******");
        printList(users);

        // sort by lastName using Comparator interface.
        Collections.sort(users, new UserSorter.CompareByLastName());
        System.out.println("\n****** Sort by lastName using Comparator interface ******");
        printList(users);

        // sort by age using Comparator interface.
        Collections.sort(users, new UserSorter.CompareByAge());
        System.out.println("\n****** Sort by lastName using Comparator interface ******");
        printList(users);

        /**
         * Output
         *
         * ****** Before sorting ******
         * First Name: Ross, Last Name: Geller, Age: 29
         * First Name: Allan, Last Name: Smith, Age: 30
         * First Name: Monica, Last Name: Geller, Age: 13
         * First Name: Joey, Last Name: Tribiani, Age: 15
         *
         * ****** Sort by firstName using Comparable interface ******
         * First Name: Allan, Last Name: Smith, Age: 30
         * First Name: Joey, Last Name: Tribiani, Age: 15
         * First Name: Monica, Last Name: Geller, Age: 13
         * First Name: Ross, Last Name: Geller, Age: 29
         *
         * ****** Sort by lastName using Comparator interface ******
         * First Name: Monica, Last Name: Geller, Age: 13
         * First Name: Ross, Last Name: Geller, Age: 29
         * First Name: Allan, Last Name: Smith, Age: 30
         * First Name: Joey, Last Name: Tribiani, Age: 15
         *
         * ****** Sort by lastName using Comparator interface ******
         * First Name: Monica, Last Name: Geller, Age: 13
         * First Name: Joey, Last Name: Tribiani, Age: 15
         * First Name: Ross, Last Name: Geller, Age: 29
         * First Name: Allan, Last Name: Smith, Age: 30
         */

    }

    public static <T> void printList(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
