package xyz.d1snin.codearchive.homeworks.level3.homework5;

public abstract class Stage {

    protected int length;
    protected String description;
    public boolean isLastStage = false;
    protected boolean winnerFounded = false;

    public String getDescription() {
        return description;
    }

    public abstract void go(Car c);
}
