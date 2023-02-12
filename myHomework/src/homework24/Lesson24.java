package homework24;

public class Lesson24 {
    public static void main(String[] args) {
        Document d1 = new Document("dok1", 10);
        Document d2 = new Document("dok2", 8);
        Document d3 = new Document("dok3", 15);

        Printer printer = new Printer();
        new Thread(() -> printer.print(d1)).start();
        new Thread(() -> printer.print(d2)).start();
        new Thread(() -> printer.print(d3)).start();
    }
}
