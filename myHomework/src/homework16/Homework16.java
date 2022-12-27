package homework16;

/**
 * Java Prof. Homework #16
 *
 * @author Dzmitry Kryvialeu
 * @version 22.12 - 27.12
 */

public class Homework16 {
    public static void main(String[] args) {
        Operationable addition = (x, y) -> x + y;
        Operationable subtraction = (x, y) -> x - y;
        Operationable multiplication = (x, y) -> x * y;
        Operationable division = (x, y) -> x / y;

        int a = addition.calculate(10, 2);
        int b = subtraction.calculate(53, 25);
        int c = multiplication.calculate(6, 5);
        int d = division.calculate(30, 6);
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}

