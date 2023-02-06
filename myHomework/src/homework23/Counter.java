package homework23;

public class Counter {
    private int value = 0;

    public synchronized void inc(){
        value++;
    }

    public synchronized void dic(){
        value--;
    }

    public int getValue() {
        return value;
    }
}
