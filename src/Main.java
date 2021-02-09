public class Main {

    public static void main(String[] args) {
        System.out.println(yes(4.2f, 5.4f, 4.3f, 6.7f)); //К заданию 3
        System.out.println(yesThisIsAnotherMethod(7, 20)); //К заданию 4
        System.out.println(anotherMethod(5)); //К заданию 5
        System.out.println(methodYes(3)); //К заданию 6
        methodHaha("Иван"); //К заданию 7
        visocosOpredelator(2003);
    }

    //idk how to name this method
    static float yes(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    static boolean yesThisIsAnotherMethod(int a, int b) {
        boolean bb1 = a + b > 10; //идея жалуется когда я использую "(a + b) > 10 && < 20" или я просто чет не понял
        boolean bb2 = a + b < 20;
        if (bb1 && bb2) {
            return true;
        } else {
            return false;
        }
    }
    static String anotherMethod(int a) {
        if (a <= 0) {
            return "Это отрицательно число";
        } else {
            return "Это положительно число";
        }
    }
    static boolean methodYes(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    static void methodHaha(String name) {
        String result = "Привет, " + name + "!";
        System.out.println(result);
    }
    static void visocosOpredelator(int year) {
        int year2 = year % 4;
        int year3 = year % 400;
        int year4 = year % 100;
        if(year2 == 0 || year3 == 0 && year4 != 0) {
            System.out.println("Это високосный год!");
        } else {
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
/*TODO:
 * 1. Создать пустой проект в IntelliJ IDEA и прописать метод main(). DONE
 * 2. Создать переменные всех пройденных типов данных и инициализировать их значения. DONE
 * 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
 * где a, b, c, d – аргументы этого метода, имеющие тип float. DONE
 * 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false. DONE
 * 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 * 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 * 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
 * 8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 * Если выполнение задач вызывает трудности, можете обратиться к последней странице методического пособия. Для задач со * не нужно искать решение в интернете, иначе нет смысла их выполнять.
 */
