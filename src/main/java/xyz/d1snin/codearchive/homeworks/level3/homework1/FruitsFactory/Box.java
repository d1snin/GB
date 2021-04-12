package xyz.d1snin.codearchive.homeworks.level3.homework1.FruitsFactory;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<Fruit> fruits = new ArrayList<>();

    private ArrayList<Fruit> getBox() {
        return fruits;
    }

    public void put(T fruit) {
        fruits.add(fruit);
        System.out.println("You have successfully put the fruit in the box");
    }

    public float getWeight() {
        float result = 0.0f;
        if (fruits.isEmpty()) return result;
        for (Fruit f : fruits) {
            result += f.getFruitWeight();
        }
        return result;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void pour(Box<T> anotherBox) {
        for (Fruit f : fruits) {
            anotherBox.getBox().add(f);
        }
        fruits.clear();
    }

    @Override
    public String toString() {
        return "This is box with " + fruits.get(0).getFruitName() + "s\nAmount: " + fruits.size();
    }
}
