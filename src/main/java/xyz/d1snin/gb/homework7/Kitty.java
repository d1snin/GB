package xyz.d1snin.gb.homework7;

public class Kitty {
    private String name;
    private int appetite;
    private boolean satiety = false;
    public Kitty(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        if (appetite <= p.info()) {
            p.decreaseFood(appetite);
            System.out.println("Котенок скушал " + appetite + " единиц.\nОсталось: " + p.info() + " единиц");
            satiety = true;
        } else {
            System.out.println("В тарелке мало еды для котенка :((");
        }
    }
    public void getSatiety(Kitty kitty) {
        if (kitty.satiety) {
            System.out.println("Котенок " + name + " сыт");
        } else {
            System.out.println("Котенок " + name + " не покушал");
        }
    }
}
