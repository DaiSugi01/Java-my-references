package exercise.java.collections.Sets.TreeSets;

import java.util.Comparator;

public class UserSorter {

    public static class CompareByFirstName implements Comparator<User> {

        @Override
        public int compare(User o1, User o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }

    public static class CompareByLastName implements Comparator<User> {

        @Override
        public int compare(User o1, User o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
}
