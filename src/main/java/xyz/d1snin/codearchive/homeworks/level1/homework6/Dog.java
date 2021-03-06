package xyz.d1snin.codearchive.homeworks.level1.homework6;

public class Dog extends Animal {
    static int dogCount = 0;
    Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void swim(int stopPoint) {
        if (stopPoint >= 10) {
            System.out.println("Собака " + name + " не может проплыть такого расстояния.");
        } else {
            System.out.println("Cобака " + name + " проплыла " + stopPoint + " м!");
        }
    }

    @Override
    public void run(int stopPoint, int limit) {
        if (stopPoint >= limit) {
            System.out.println("Собака " + name + " не может пробежать такого расстояния.");
        }
        else {
            System.out.println("Собака " + name + " пробежала " + stopPoint + " м!");
        }
    }
}
