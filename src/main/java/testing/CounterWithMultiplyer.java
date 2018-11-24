package testing;

class CounterWithMultiplyer {
    private Multiplyer multiplyer;
    private int result = 0;

    CounterWithMultiplyer(Multiplyer multiplyer) {
        this.multiplyer = multiplyer;
    }

    int getResult() {
        return result;
    }

    void count() {
        for (int i = 0; i < 100; i++) {
            result += multiplyer.multiplyByTen(i);
        }
    }
}
