package functional;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        FizzBuzzable myFizzBuzzLambda = x -> "test";

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        integers.forEach( x -> System.out.println(myFizzBuzzLambda));
    }
}
