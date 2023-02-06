package homework23;

public class BankAccountDemo {
    public static void main(String[] args) throws InterruptedException {
        BankAccount ba = new BankAccount(250);
        Thread u1 = new Thread(() -> ba.pay(80, "Mike"));
        Thread u2 = new Thread(() -> ba.pay(100, "Mark"));
        Thread u3 = new Thread(() -> ba.pay(150, "Bill"));
        Thread u4 = new Thread(() -> ba.pay(75, "John"));
        u1.start();
        u2.start();
        u3.start();
        u4.start();
        u1.join();
        u2.join();
        u3.join();
        u4.join();
        System.out.println(ba);
    }
}
