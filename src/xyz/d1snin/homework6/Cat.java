package xyz.d1snin.homework6;

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
    public void run(int stopPoint) {
        if (stopPoint >= 200) {
            System.out.println("Кот " + name + " не может пробежать такого расстояния.");
        } else {
            System.out.println("Кот " + name + " пробежал " + stopPoint + " м!");
        }
    }
}
