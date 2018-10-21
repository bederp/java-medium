package exceptions;

public class Task1 {
    //1. Create your own exception, constructor should take String in
    public static void main(String[] args) {
        //2 Create try..catch..finally block

        //3 Throw your exception and catch it
        // add println statements in each code block
        catchingMethod();
        System.out.println("----------------------------");
        //4 Optional() catch your exception one method higher
        // see how it changes flow of execution
        try {
            throwingMethod();
        } catch (MyException e) {
            System.out.println("In outer method");
        }
    }

    private static void catchingMethod() {
        try {
            throw new MyException("My exception");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("In finally");
        }
    }

    private static void throwingMethod() throws MyException {
        try {
            throw new MyException("My exception");
        } finally {
            System.out.println("In finally"); //gets executed before exiting method!
        }
    }
}
