package xyz.d1snin.gb.homeworks.level1.homework5;

public class Workers {
    public static void main(String[] args) {
        Worker[] workerArray = new Worker[5];
        workerArray[0] = new Worker("Ivanov Ivan Ivanovich", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        workerArray[1] = new Worker("Igorev Victor Nikolaevich", "Designer", "examp@example.com", "+7873912873", 35000, 29);
        workerArray[2] = new Worker("Belyaev Nikolay Alekseevich", "Architect", "anotherex@example.com", "+938971928398", 125000, 41);
        workerArray[3] = new Worker("Popov Dmitry Aleksandrovich", "QA", "pda@yahoo.com", "+8387298739", 34000, 24);
        workerArray[4] = new Worker("Ignatiev Maksim Sergeevich", "System Admin", "maks@yandex.ru", "+793892893293", 39000, 47);
        Worker worker1 = new Worker(); //test
        worker1.workerInfo(); // test

        for (int i = 0; i < workerArray.length; i++) {
            if (workerArray[i].age >= 40) {
                workerArray[i].workerInfo();
            }
        }
    }
}


/*
TODO:
4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);

5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */