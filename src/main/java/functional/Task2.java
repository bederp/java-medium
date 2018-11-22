package functional;

import java.util.List;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        IntStream integers = IntStream.range(0,101);
        integers.forEach(x -> System.out.println(getFizzBuzzable().fizBuzz(x)));
    }

    private static FizzBuzzable getFizzBuzzable() {
        return x -> {
            if (x % 15 == 0) {
                return "FizzBuzz";
            } else if (x % 3 == 0) {
                return "Fizz";
            } else if (x% 5 == 0) {
                return "Buzz";
            } else return String.valueOf(x);
        };
    }
}
