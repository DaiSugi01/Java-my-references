package exercise.java.collections.Sorting;

import java.util.Comparator;

public class UserSorter {

    public static class CompareByLastName implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            // sort by last name
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }

    public static class CompareByAge implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            // sort by age
            return o1.getAge() - o2.getAge();
        }
    }
}
