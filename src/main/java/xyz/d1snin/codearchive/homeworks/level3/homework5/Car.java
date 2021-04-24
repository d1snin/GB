package xyz.d1snin.codearchive.homeworks.level3.homework5;

public class Car implements Runnable {

    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    private static boolean isPrinted = false;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            MainClass.log(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            MainClass.log(this.name + " готов");
            MainClass.cdl.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            MainClass.cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!isPrinted) {
            isPrinted = true;
            MainClass.log("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
    }
}
