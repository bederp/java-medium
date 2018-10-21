package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        //2. Invoke your method with different Collections and Comparators
        Person john = new Person("John", "Doe", 38, 3200);
        Person kasia = new Person("Kasia", "Ster", 18, 1900);
        Person bogacz = new Person("Jan", "Bogaty", 23, 999999);

        List<Person> persons = new ArrayList<>();
        persons.add(john);
        persons.add(kasia);
        persons.add(bogacz);

        Comparator<Person> byAge = ageComparator();
        Comparator<Person> bySalary = salaryComparator();
        System.out.println("Oldest person is: " + max(persons, byAge));
        System.out.println("Earns the most: " + max(persons, bySalary));
    }

    private static Comparator<Person> salaryComparator() {
        return Comparator.comparingDouble(o -> o.salary);
    }

    private static Comparator<Person> ageComparator() {
        return Comparator.comparingLong(o -> o.age);
    }

    //1. Write your own max function which takes 2 parameters:
    //   Collection which Produces elements to be compared
    //   Comparators which is Consumer of elements in collection
    private static <T> T max(Collection<? extends T> collection, Comparator<? super T> comparator) {
        if (collection.size() == 0) {
            return null;
        }
        T maxElement = collection.iterator().next();
        for (T currentElement : collection) {
            int compareResult = comparator.compare(maxElement, currentElement);
            if (compareResult < 0) {
                maxElement = currentElement;
            }
        }
        return maxElement;
    }
}
