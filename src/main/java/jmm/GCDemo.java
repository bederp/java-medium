package jmm;

import java.util.Random;

public class GCDemo {

    private static final int ONE_MILLION = 1_000_000;

    public static void main(String[] args) throws InterruptedException {
        SpaceWasted[] wasted = new SpaceWasted[ONE_MILLION];

        int count = 0;
        Random rnd = new Random();
        while (true) {
            wasted[rnd.nextInt(wasted.length)] = new SpaceWasted();
            if (count % ONE_MILLION == 0) {
                System.out.print("*");
            }
            count++;
            Thread.sleep(1);
        }
    }
}

class SpaceWasted{
    long a;
    long b;
    long c;
    long d;
    long e;
    long f;
    long g;
    long h;
}
