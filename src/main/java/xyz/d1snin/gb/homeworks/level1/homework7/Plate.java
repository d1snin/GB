package xyz.d1snin.gb.homeworks.level1.homework7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void addFood(int n) {
        food += n;
    }
    public int info() {
        return food;
    }
}