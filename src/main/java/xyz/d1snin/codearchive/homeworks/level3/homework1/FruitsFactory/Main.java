package xyz.d1snin.codearchive.homeworks.level3.homework1.FruitsFactory;

public class Main {
    public static void main(String[] args) {
        //создаем две коробки с яблоками и апельсинами
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        //добавляем в коробку с апельсинами фрукты
        orangeBox.put(new Orange());
        orangeBox.put(new Orange());
        orangeBox.put(new Orange());
        orangeBox.put(new Orange());
        //должен сказать что так делать нельзя
        orangeBox.put(new Apple());
        //добавляем в коробку с яблоками фрукты
        appleBox.put(new Apple());
        appleBox.put(new Apple());
        appleBox.put(new Apple());
        appleBox.put(new Apple());
        //должен сказать что так делать нельзя
        appleBox.put(new Orange());
        //получаем вес коробки с апельсинами
        System.out.println(orangeBox.getWeight());
        //получаем вес коробки с яблоками
        System.out.println(appleBox.getWeight());
        //сравнивем вес коробок (true - если вес не отличается)
        System.out.println(appleBox.compare(orangeBox));
        System.out.println(orangeBox.compare(appleBox));
        //создаем новую коробку с яблоками и пересыпаем туда их
        Box<Apple> newBoxWithApples = new Box<>();
        appleBox.pour(newBoxWithApples);
        System.out.println(newBoxWithApples);
    }
}
