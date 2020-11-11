package exercise.java.collections.Sets.TreeSets;

public class User implements Comparable<User>{

    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    @Override
    public int compareTo(User o) {
        // compare by age.
        return this.getAge() - o.getAge();
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return this.getFirstName().equals(user.getFirstName());
    }

    @Override
    public int hashCode() {
        return this.firstName.hashCode();
    }

    @Override
    public String toString() {
        return "Name: " + getFullName() + ", Age: " + age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
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
