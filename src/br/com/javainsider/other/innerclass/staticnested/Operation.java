package br.com.javainsider.other.innerclass.staticnested;

public class Operation {
    private static int initialValue = 10;

    private final int value1;
    private final int value2;
    private final Counter counter = new Counter();


    public Operation(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int sum() {
        counter.increment();
        return value1 + value2;
    }

    public Counter getCounter() {
        return counter;
    }

    public static class Counter {
        private int value = initialValue;

        public void increment() {
            value++;
        }

        public int getValue() {
            return value;
        }
    }
}
