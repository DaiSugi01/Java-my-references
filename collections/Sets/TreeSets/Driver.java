package exercise.java.collections.Sets.TreeSets;

import java.util.TreeSet;

public class Driver {

    public static void main(String[] args) {

        // sort by age using Comparable interface
        TreeSet<User> userSetSortedByAge = new TreeSet<>();
        userSetSortedByAge.add(new User("Ross", "Geller", 29));
        userSetSortedByAge.add(new User("Allan", "Smith", 30));
        userSetSortedByAge.add(new User("Monica", "Geller2", 13));
        userSetSortedByAge.add(new User("Joey", "Tribiani", 15));

        System.out.println("***** This TreeSet is Sorted by age using Comparable interface *****");
        System.out.println(userSetSortedByAge);

        // You can use Comparator to sort TreeSet
        TreeSet<User> userSetSortedByFirstName = new TreeSet<>(new UserSorter.CompareByFirstName());
        userSetSortedByFirstName.add(new User("Ross", "Geller", 29));
        userSetSortedByFirstName.add(new User("Allan", "Smith", 30));
        userSetSortedByFirstName.add(new User("Monica", "Geller2", 13));
        userSetSortedByFirstName.add(new User("Joey", "Tribiani", 15));

        System.out.println("\n***** This TreeSet is Sorted by firstName using Comparator interface *****");
        System.out.println(userSetSortedByFirstName);

        // sort by lastName using Comparator interface
        TreeSet<User> userSetSortedByLasttName = new TreeSet<>(new UserSorter.CompareByLastName());
        userSetSortedByLasttName.add(new User("Ross", "Geller", 29));
        userSetSortedByLasttName.add(new User("Allan", "Smith", 30));
        userSetSortedByLasttName.add(new User("Monica", "Geller2", 13));
        userSetSortedByLasttName.add(new User("Joey", "Tribiani", 15));

        System.out.println("\n***** This TreeSet is Sorted by lastName using Comparator interface *****");
        System.out.println(userSetSortedByLasttName);

        /**
         * output
         *
         * ***** This TreeSet is Sorted by age using Comparable interface *****
         * [Name: Monica Geller2, Age: 13, Name: Joey Tribiani, Age: 15, Name: Ross Geller, Age: 29, Name: Allan Smith, Age: 30]
         *
         * ***** This TreeSet is Sorted by firstName using Comparator interface *****
         * [Name: Allan Smith, Age: 30, Name: Joey Tribiani, Age: 15, Name: Monica Geller2, Age: 13, Name: Ross Geller, Age: 29]
         *
         * ***** This TreeSet is Sorted by lastName using Comparator interface *****
         * [Name: Ross Geller, Age: 29, Name: Monica Geller2, Age: 13, Name: Allan Smith, Age: 30, Name: Joey Tribiani, Age: 15]
         *
         */

    }
}
