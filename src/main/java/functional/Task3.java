package functional;

import generics.Person;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static generics.Person.olderThan;
import static generics.Person.youngerThan;

public class Task3 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Lois", "Salinas", 12, 20),
                new Person("Alyssia", "Sharples", 24, 800),
                new Person("Aarush", "Merritt", 63, 1200),
                new Person("Kaycee ", "Barrera", 73, 600),
                new Person("Blane ", "Peters", 55, 623),
                new Person("Giacomo ", "Traynor", 23, 452),
                new Person("Myra ", "Doherty", 53, 456),
                new Person("Blair ", "Lancester", 42, 675),
                new Person("Allen ", "Whyte", 11, 20),
                new Person("Megan ", "Couche", 9, 30),
                new Person("Daphne ", "Justice", 34, 1500));

        DoubleSummaryStatistics salaryStatistics = people.stream()
                .filter(youngerThan(18).negate())
                .filter(olderThan(60).negate())
                .peek(System.out::println)
                .collect(Collectors.summarizingDouble(Person::getSalary));

        System.out.println(salaryStatistics);
    }

//    TODO
//    Remove people younger than 18y and older than 60y
//    Calculate statistics for the rest of the group

}
