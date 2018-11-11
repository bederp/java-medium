package generics;

public class Person {
    private String firstName;
    private String lastName;
    long age;
    double salary;

    public Person(String firstName, String lastName, long age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " salary: " + salary + " age: " + age;
    }
}
