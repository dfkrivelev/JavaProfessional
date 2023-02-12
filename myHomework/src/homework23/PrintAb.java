package homework23;

public class PrintAb {
    private final Object mon = new Object();
    private volatile char currentChar = 'A';

    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (currentChar != 'A') {
                        mon.wait();
                    }
                    System.out.print('A');
                    currentChar = 'B';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 20; i++) {
                    while (currentChar != 'B') {
                        mon.wait();
                    }
                    System.out.print('B');
                    currentChar = 'C';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 30; i++) {
                    while (currentChar != 'C') {
                        mon.wait();
                    }
                    System.out.print('C');
                    currentChar = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
