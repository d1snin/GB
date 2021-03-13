package xyz.d1snin.codearchive.homeworks.level2.homework1;

public class Wall implements Obstruction, JumpObstruction {
    public Wall(int size) {
        setSize(size);
    }
    private static int SIZE;

    public int getSize() {
        return SIZE;
    }
    public void setSize(int size) {
        this.SIZE = size;
    }
}
