package homework23;

/**
 * Java Prof. Homework #23
 *
 * @author Dzmitry Kryvialeu
 * @version 02.02 - 06.02
 */

public class PrintABC {
    public static void main(String[] args) {
        PrintAb pab = new PrintAb();
        new Thread(() -> pab.printA()).start();
        new Thread(() -> pab.printB()).start();
        new Thread(() -> pab.printC()).start();
    }
}
