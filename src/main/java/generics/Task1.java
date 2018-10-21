package generics;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        //1. Create list of Ingeters
        List<Integer> ints = new ArrayList<>();

        //2. Add some elements
        ints.add(5);
        ints.add(10);
        //4. Use the method
        System.out.println(max(ints));

        //5. Try passing List of Doubles into the method, check what happens
        List<Double> doubles = new ArrayList<>();
        doubles.add(3.13);
        doubles.add(5.12);
        //System.out.println(max(doubles)); Will not compile wrong parameter type!
    }

    //3. Create method which will return maximum element from the list
    private static Integer max(List<Integer> ints) {
        int max = Integer.MIN_VALUE;
        for (Integer integer : ints) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }
}