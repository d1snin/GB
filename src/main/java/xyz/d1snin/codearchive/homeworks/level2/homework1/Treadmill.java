package xyz.d1snin.codearchive.homeworks.level2.homework1;

public class Treadmill implements Obstacle {
    private final int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void overcome(Competitor competitor) {
        competitor.run(distance);
    }
}