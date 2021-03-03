package xyz.d1snin.gb.homework5;

public class Worker {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    Worker() {
        fullName = "Соловьев Александр Викторович";
        position = "QA";
        email = "sav@bigrat.monster";
        phoneNumber = "+19389200392032";
        salary = 39000;
        age = 19;
    }




    Worker(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    void workerInfo() {
        System.out.println("<-------------------------------------->\nФИО: " + fullName + "\nДолжность: " + position + "\nE-Mail: " + email + "\nНомер телефона: " + phoneNumber + "\nЗарплата: " + salary + "\nВозраст: " + age);
    }
}


/*
TODO:
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 */