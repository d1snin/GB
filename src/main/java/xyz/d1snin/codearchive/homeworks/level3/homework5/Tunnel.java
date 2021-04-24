package xyz.d1snin.codearchive.homeworks.level3.homework5;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {

    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    private static final Semaphore semaphore = new Semaphore(MainClass.CARS_COUNT / 2);

    @Override
    public void go(Car c) {
        try {
            try {
                MainClass.log(c.getName() + " готовится к этапу(ждет): " + description);
                semaphore.acquire();
                MainClass.log(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                MainClass.log(c.getName() + " закончил этап: " + description);
                MainClass.cdl1.countDown();
                if (isLastStage && !winnerFounded) {
                    winnerFounded = true;
                    MainClass.log("WIN - " + c.getName());
                }
                semaphore.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
