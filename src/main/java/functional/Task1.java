package functional;

public class Task1 {
    public static void main(String[] args) {
        Runnable myFirstLambda = null; //TODO: write lambda

        new Thread(myFirstLambda).start();
    }
}
