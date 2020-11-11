package exercise.java.collections.Sets.HashSets;

public class UserA {

    private String firstName;
    private String lastName;
    private int age;

    public UserA(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    @Override
    public boolean equals(Object obj) {
        // check whether it has the same first name
        UserA user = (UserA) obj;
        return this.getFirstName().equals(user.getFirstName());
    }

    @Override
    public int hashCode() {
        return this.firstName.hashCode();
    }

    @Override
    public String toString() {
        return "First Name: " + firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
