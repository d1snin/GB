package xyz.d1snin.gb.homework6;

public abstract class Animal {

    String name;

    Animal(String name) {
        xyz.d1snin.homework6.ZooApp.animalsCount++;
        this.name = name;
    }

    public abstract void swim(int stopPoint);

    public abstract void run(int stopPoint);
}