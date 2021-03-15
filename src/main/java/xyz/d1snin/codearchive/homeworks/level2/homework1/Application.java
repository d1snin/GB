package xyz.d1snin.codearchive.homeworks.level2.homework1;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Competitor[] competitors = {
                new Robot("C-3PO"),
                new Cat("Tom"),
                new Human("Ivan")
        };

        Obstacle[] obstacles = {
                new Treadmill(450),
                new Wall(10),
                new Treadmill(550)
        };

        for (Obstacle obstacle : obstacles) {
            for (Competitor competitor : competitors) {
                obstacle.overcome(competitor);
            }
        }

        System.out.println("=============================");

        printWinners(competitors);
    }

    private static void printWinners(Competitor[] competitors) {
        Arrays.stream(competitors)
                .filter(Competitor::isOnDistance)
                .forEach(Competitor::printInfo);
    }
}
