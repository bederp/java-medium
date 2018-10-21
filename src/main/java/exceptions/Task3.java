package exceptions;

public class Task3 {
    public static void main(String[] args) {
        //5. Add your AutoCloseable into try statement
        //6. Investigate execution hierarchy between closeable, catch and finally
        try (MyResource res = new MyResource()) {
            f();
        } catch (MyOtherException e) {
            System.out.println("Caught other exception");
        } finally {
            System.out.println("In finally");
        }
    }
    //1. Create two methods f(), g()
    //3. catch exception in f method and re-throw it as different exception
    private static void f() throws MyOtherException {
        try {
            g();
        } catch (MyException e) {
            throw new MyOtherException("re throwing as other exception");
        }
    }
    //2. f calls g, g throws
    private static void g() throws MyException {
        throw new MyException("From g()");
    }
    //4. create your class which implements AutoCloseable
}
