package xyz.d1snin.gb.homework6;

public class Cat extends Animal {
    static int catCount = 0;
    Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void swim(int stopPoint) {
        System.out.println("Кот " + name + " не умеет плавать.");
    }

    @Override
    public void run(int stopPoint, int limit) {
        if (stopPoint >= limit) { //200
            System.out.println("Кот " + name + " не может пробежать такого расстояния.");
        } else {
            System.out.println("Кот " + name + " пробежал " + stopPoint + " м!");
        }
    }
}
