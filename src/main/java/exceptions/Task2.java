package exceptions;

public class Task2 {


    public static void main(String[] args) {
        //1. Create 2 new exception types

        //2. Catch both exceptions in one catch block
        try {
            throwsException();
            throwsOtherException();
        } catch (MyException | MyOtherException e) {
            System.out.println("This can catch both exceptions");
        }

        System.out.println("-------------------------------------");
        //3. Write code that generates ArrayIndexOutOfBoundsException
        try {
            outOfBounds();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught out of bounds");
        }
    }

    private static void outOfBounds() {
        String stringArray[] = new String[10];

        try {
            String outOfBound = stringArray[11];
            //4. Add finally clause, see what happens
        } finally {
            System.out.println("This executes before out of bounds is handled");
        }
    }

    private static void throwsOtherException() throws MyException {
        throw new MyException("exception");
    }

    private static void throwsException() throws MyOtherException {
        throw new MyOtherException("other exception");
    }

}
