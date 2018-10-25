package jmm;

public class OutOfMemoryError {
    public static void main(String args[]) {
        OutOfMemoryError ome = new OutOfMemoryError();
        ome.generateMyIntArray();
    }

    private void generateMyIntArray() {
        int multiplier = 2;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            System.out.println("Round " + i + " Free Memory: " + Runtime.getRuntime().freeMemory());
            int[] myIntList = new int[multiplier];
            multiplier = multiplier * 2;
        }
    }
}
