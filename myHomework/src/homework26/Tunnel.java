package homework26;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {

    private static final Semaphore sp = new Semaphore(MainClass.CARS_COUNT / 2);

    public Tunnel(int length) {
        this.length = length;
        this.description = "Тоннель " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                sp.acquire();
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
                System.out.println(c.getName() + " закончил этап: " + description);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                sp.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
