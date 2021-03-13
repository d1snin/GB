package xyz.d1snin.codearchive.homeworks.level2.homework1;

public class Treadmill implements Obstruction, RunObstruction {
    public Treadmill(int size) {
        setSize(size);
    }
    private static int SIZE;

    @Override
    public int getSize() {
        return SIZE;
    }
    @Override
    public void setSize(int length) {
        this.SIZE = length;
    }
}