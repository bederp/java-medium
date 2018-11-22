package functional;

public class Task1 {
    public static void main(String[] args) {
        Runnable myFirstLambda = () -> System.out.println("Hello from lambda");

        new Thread(myFirstLambda).start();
    }
}
