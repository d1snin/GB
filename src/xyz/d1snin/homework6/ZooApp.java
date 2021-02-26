package xyz.d1snin.homework6;

public class ZooApp {

    public static int animalsCount = 0;

    public static void main(String[] args) {

        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Шарик");

        System.out.println("Всего животных: " + animalsCount);
        cat.run(180);
        //cat.run(230);
        cat.swim(10);
        dog.run(420);
        //dog.run(560);
        dog.swim(5);
        //dog.swim(15);
    }
}
