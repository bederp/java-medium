package generics;

import java.util.function.Predicate;

public class Person {
    long age;
    double salary;
    private String firstName;
    private String lastName;


    public Person(String firstName, String lastName, long age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public static Predicate<? super Person> olderThan(int age) {
        return person -> person.age > age;
    }

    public static Predicate<? super Person> youngerThan(int age) {
        return person -> person.age < age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " salary: " + salary + " age: " + age;
    }

}
