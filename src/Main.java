import java.util.Scanner; //импорт пакета, который читает пользовательский ввод

public class Main {

    public static void main(String[] args) {
        while (true) { //с помощью этого цикла выполнение не завершится
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
                System.out.println("Результат: " + calculator(float1, float2, float3, float4)); //результат к  заданию 3
                System.out.println("Введите первое число");
                int sumNumb1 = scan.nextInt(); //здесь пользователь вводит целое число
                System.out.println("Введите второе число");
                int sumNumb2 = scan.nextInt(); //тут тоже
                System.out.println("Результат: " + isSumBetween10and20(sumNumb1, sumNumb2)); //результат к заданию 4
                System.out.println("Введите число");
                int numberNegativeOrPositive = scan.nextInt(); //здесь пользователь вводит целое число
                System.out.println("Результат: " + negativeOrPositive(numberNegativeOrPositive)); //Результат к заданию 5
                System.out.println("Введите число");
                int negativeOrPositive = scan.nextInt(); //здесь пользователь вводит целое число
                System.out.println(isNegativeOrPositive(negativeOrPositive)); //К заданию
                System.out.println("Введите ваше имя для показа приветствия");
                String name = scan.next(); //здесь пользователь вводит свое имя (строку)
                helloName(name); //результат к заданию 7
                System.out.println("Введите год, чтобы определить високосный он или нет");
                int year = scan.nextInt(); //здесь вводится год (целое число)
                leapYearYesOrNo(year); //результат к заданию 8
                System.out.println("Программа запускается заново!");
            } catch (Exception e) { //с помощью try catch мы можем словить ошибку и обработать ее, будет выведено сообщение ниже и код запустится заново.
                System.out.println("вы ввели что то не так, попробуйте еще раз.");
            }
        } //на этом месте за счет цикла while начинается выполнение метода main сначала
    }

    static float calculator(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    static boolean isSumBetween10and20(int a, int b) {
        int z = a + b;
        return (z < 20) && (z > 10);
    }

    static String negativeOrPositive(int a) {
        if (a <= 0) { //если a меньше или равно нулю
            return "Это отрицательноe число"; //Возвращает строку
        } else { // иначе
            return "Это положительноe число"; //Возвращает строку
        }
    }

    static boolean isNegativeOrPositive(int a) {
            return a < 0; //если а будет меньше нуля то вернет истину, иначе - ложь
    }

    static void helloName(String name) {
        String result = "Привет, " + name + "!";
        System.out.println(result);
    }

    static void leapYearYesOrNo(int year) { //инициализация метода который принимает в аргументы год
        if (year < 1) { //если год меньше единицы
            System.out.println("Введите валидный год!");
        }
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) { // если год делится нацело на 4 или если делится нацело на 400 и не делится нацело на 100 то
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
}