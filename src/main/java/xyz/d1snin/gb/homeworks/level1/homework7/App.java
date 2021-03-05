package xyz.d1snin.gb.homeworks.level1.homework7;

public class App {
    public static void main(String[] args) {
//        Kitty kitty = new Kitty("Barsik", 5);
//        Plate plate = new Plate(100);
//        plate.info();
//        kitty.eat(plate);
//        plate.info();
        Plate plate = new Plate(10);
        plate.addFood(10);
        System.out.println("В тарелке: " + plate.info() + " единиц");
        Kitty[] cats = {
                new Kitty("Vasya", 6),
                new Kitty("Murzik", 16),
                new Kitty("Pirat", 9)
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].getSatiety(cats[i]);
        }
    }
}

/* TODO:
* Расширить задачу про котов и тарелки с едой.
* Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
* Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
* Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
* Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
* Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

 */
