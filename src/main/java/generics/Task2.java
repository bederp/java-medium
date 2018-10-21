package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        //2. Create different generics collections
        List<Integer> ints = new ArrayList<>();
        ints.add(4);
        ints.add(12);
        List<Double> doubles = new ArrayList<>();
        doubles.add(3.14);
        doubles.add(12.245);
        //3. Invoke method
        takesNumbersCollection(ints);
        takesNumbersCollection(doubles);
    }

    //1. Create a generic method which can take a Collection with elemtents of type upper bound of Numbers
    private static void takesNumbersCollection(Collection<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.println(number + "  when as Integer: " + number.intValue());
        }
    }
}
