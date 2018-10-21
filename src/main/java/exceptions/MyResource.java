package exceptions;

public class MyResource implements AutoCloseable {
    @Override
    public void close() throws MyOtherException {
        System.out.println("closed automatically");
    }
}
