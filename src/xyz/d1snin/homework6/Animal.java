package xyz.d1snin.homework6;

public abstract class Animal {

    String name;

    Animal(String name) {
        ZooApp.animalsCount++;
        this.name = name;
    }

    public abstract void swim(int stopPoint);

    public abstract void run(int stopPoint);
}