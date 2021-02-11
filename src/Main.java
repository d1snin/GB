import java.util.Scanner; //импорт пакета, который читает пользовательский ввод

public class Main {

    public static void main(String[] args)  {
    while(true) { //с помощью этого цикла выполнение не завершится
        try {
            Scanner scan = new Scanner(System.in); //создание нового экземпляра класса
            System.out.println("Добро пожаловать!");
            System.out.println("ведите первое число с плавающей запятой!");
            float float1 = scan.nextFloat(); //тут пользователь вводит число с плавающей запятой
            System.out.println("Введите второе число с плавающей запятой!");
            float float2 = scan.nextFloat(); //тут тоже
            System.out.println("Введите третье число с плавающей запятой!");
            float float3 = scan.nextFloat(); //и тут
            System.out.println("Введите четвертое число с плавающей запятой!");
            float float4 = scan.nextFloat(); //и тут
            System.out.println("Результат: " + yes(float1, float2, float3, float4)); //результат к  заданию 3
            System.out.println("Введите первое число");
            int firstNum = scan.nextInt(); //здесь пользователь вводит целое число
            System.out.println("Введите второе число");
            int secondNum = scan.nextInt(); //тут тоже
            System.out.println("Результат: " + yesThisIsAnotherMethod(firstNum, secondNum)); //результат к заданию 4
            System.out.println("Введите число");
            int fiveNumber = scan.nextInt(); //здесь пользователь вводит целое число
            System.out.println("Результат: " + anotherMethod(fiveNumber)); //Результат к заданию 5
            System.out.println("Введите число");
            int intYes = scan.nextInt(); //здесь пользователь вводит целое число
            System.out.println(methodYes(intYes)); //К заданию
            System.out.println("Введите ваше имя для показа приветствия");
            String nameYes = scan.next(); //здесь пользователь вводит свое имя (строку)
            methodHaha(nameYes); //результат к заданию 7
            System.out.println("Введите год, чтобы определить високосный он или нет");
            int yearForMethod = scan.nextInt(); //здесь вводится год (целое число)
            methodOpr(yearForMethod); //результат к заданию 8
            System.out.println("Программа запускается заново!");
        } catch (Exception e) { //с помощью try catch мы можем словить ошибку и обработать ее, будет выведено сообщение ниже и код запустится заново.
            System.out.println("вы ввели что то не так, попробуйте еще раз.");
            }
        } //на этом месте за счет цикла while начинается выполнение метода main сначала
    }

    static float yes(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    static boolean yesThisIsAnotherMethod(int a, int b) {
        boolean bb1 = a + b > 10; //жалуется когда я использую "(a + b) > 10 && < 20" или я просто чет не понял
        boolean bb2 = a + b < 20;
        if (bb1 && bb2) { // если значения соответствуют параметрам выше
            return true; //возвращает истину
        } else { //иначе
            return false; //возвращает ложь
        }
    }
    static String anotherMethod(int a) {
        if (a <= 0) { //если a меньше или равно нулю
            return "Это отрицательно число"; //Возвращает строку
        } else { // иначе
            return "Это положительно число"; //Возвращает строку
        }
    }
    static boolean methodYes(int a) {
        if (a < 0) { //если a меньше нуля
            return true; //возвращает истину
        } else { //иначе
            return false; //возвращает ложь
        }
    }
    static void methodHaha(String name) {
        String result = "Привет, " + name + "!";
        System.out.println(result);
    }
    static void methodOpr(int year) { //инициализация метода который принимает в аргументы год
        if (year < 1) { //если год меньше единицы
            System.out.println("Введите валидный год!");
        }
        int year2 = year % 4;
        int year3 = year % 400;
        int year4 = year % 100;
        if(year2 == 0 || year3 == 0 && year4 != 0) { // если год делится нацело на 4 или если делится нацело на 400 и не делится нацело на 100 то
            System.out.println("Это високосный год!");
        } else { //иначе
            System.out.println("Это не високосный год!");
        }
    }
    //К заданию 2:
    int i = 6;
    float f = 4.2f;
    double d = 3.5;
    byte b = 32;
    short s = 43;
    long l = 64L;
    String n = "Some text here";
    char ch = 'z';
    boolean w = false;