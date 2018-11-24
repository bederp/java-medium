package testing;

public class Main {
    public static void main(String[] args) {
        CounterWithMultiplyer counter = new CounterWithMultiplyer(new Multiplyer());
        counter.count();

        System.out.println(counter.getResult());
    }
}
