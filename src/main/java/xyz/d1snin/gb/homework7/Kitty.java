package xyz.d1snin.gb.homework7;

public class Kitty {
    private String name;
    private int appetite;
    public Kitty(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        if (appetite <= p.info()) {
            p.decreaseFood(appetite);
            System.out.println("Котенок скушал " + appetite + " единиц.\nОсталось: " + p.info() + " единиц");
        }
    }
}
