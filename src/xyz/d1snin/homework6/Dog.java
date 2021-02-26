package xyz.d1snin.homework6;

public class Dog extends Animal {
    Dog(String name) {
        super(name);
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
    public void run(int stopPoint) {
        if (stopPoint >= 500) {
            System.out.println("Собака " + name + " не может пробежать такого расстояния.");
        }
        else {
            System.out.println("Собака " + name + " пробежала " + stopPoint + " м!");
        }
    }
}
