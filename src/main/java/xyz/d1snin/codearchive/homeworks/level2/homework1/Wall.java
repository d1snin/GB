package xyz.d1snin.codearchive.homeworks.level2.homework1;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Competitor competitor) {
        competitor.jump(height);
    }
}
