package xyz.d1snin.codearchive.homeworks.level3.homework5;

import java.util.concurrent.CountDownLatch;

public class MainClass {

    public static final int CARS_COUNT = 4;
    public static CountDownLatch cdl = new CountDownLatch(CARS_COUNT);
    public static CountDownLatch cdl1;

    public static void main(String[] args) {
        try {

            log("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

            Race race = new Race(new Road(60), new Tunnel(), new Road(40));
            Car[] cars = new Car[CARS_COUNT];

             cdl1 = new CountDownLatch(CARS_COUNT * Race.STAGES_COUNT);

            for (int i = 0; i < cars.length; i++) {
                cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
            }

            for (int i = 0; i < cars.length; i++) {
                new Thread(cars[i]).start();
            }

            cdl1.await();

            log("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void log(String msg) {
        System.out.println(msg + "\n");
    }
}
