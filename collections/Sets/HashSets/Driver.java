package exercise.java.collections.Sets.HashSets;

import java.util.ArrayList;
import java.util.HashSet;

public class Driver {

    public static void main(String[] args) {

        ArrayList<UserA> userAList = new ArrayList<>();
        userAList.add(new UserA("Ross", "Geller1", 29));
        userAList.add(new UserA("Ross", "Geller2", 31));
        userAList.add(new UserA("Ross", "Geller", 30));

        // Create hashSet object
        HashSet<UserA> userASet = new HashSet<>();

        // add all of objects ArrayList has
        userASet.addAll(userAList);
        // also you can add an object individually
        userASet.add(new UserA("Allan", "Smith", 32));
        userASet.add(new UserA("Ross", "Geller3", 33));


        // Create hashset of userB
        ArrayList<UserB> userBList = new ArrayList<>();
        userBList.add(new UserB("Ross", "Geller1", 29));
        userBList.add(new UserB("Ross", "Geller2", 31));
        userBList.add(new UserB("Allan", "Smith", 32));
        userBList.add(new UserB("Ross", "Geller", 30));

        // Create hashSet object
        HashSet<UserB> userBSet = new HashSet<>();

        // add all of objects ArrayList has
        userBSet.addAll(userBList);

        System.out.println("***** This has unique objects. Remove duplicated objects which has the same firstName *****");
        System.out.println("UserA HashSet: " + userASet);

        System.out.println("\n***** This has duplicated objects since UserA object DOES NOT override equals() & hashCode() *****");
        System.out.println("UserB HashSet: " + userBSet);

        /**
         * output
         *
         * ***** This has unique objects. Remove duplicated objects which has the same firstName *****
         * UserA HashSet: [First Name: Allan, First Name: Ross]
         *
         * ***** This has duplicated objects since UserA object DOES NOT override equals() & hashCode() *****
         * UserB HashSet: [First Name: Allan, First Name: Ross, First Name: Ross, First Name: Ross]
         *
         */
    }
}
