import java.util.Arrays;

public class ArraysClass {

    public static void main(String[] args) {
        System.out.println("Результат к заданию 1: " + arrayReplace1and0()); //к заданию 1
        System.out.println("Результат к заданию 2: " + fillArray()); //к заданию 2
        System.out.println("Результат к заданию 3:");
        ifLess6Multiple2(); //к заданию 3
        System.out.println("Результат к заданию 4:");
        diagonalArray1();
        System.out.println("Результат к заданию 5:");
        minAndMaxElements();
        System.out.println("Результат к заданию 6:");
        int[] arrayCheckBalance = { 6, 3, 9 };
        System.out.println(checkBalance(arrayCheckBalance));
        System.out.println("Результат к заданию 7:");
        int[] shiftArray = {1, 2, 3, 4, 5,};
        shiftArray(shiftArray, -2);
        System.out.println(Arrays.toString(shiftArray));
    }

    public static String fillArray() {
        int[] arrIntegers = new int[8];
        int x = 0;
        for (int i = 0; i < arrIntegers.length; i++) {
            arrIntegers[i] = x;
            x += 3;
        }
        return java.util.Arrays.toString(arrIntegers);
    }

    public static String arrayReplace1and0() {
        int[] arr = {1, 1, 0, 1, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        return java.util.Arrays.toString(arr);
    }

    public static void ifLess6Multiple2() {
        int[] integersArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i : integersArray) { //idea говорит мне что можно заменить обычный цикл for на расширенный, поэтому я сделал это, не люблю варны.
            if (i <= 6) {
                System.out.println(i * 2);
            }
        }
    }

    public static void diagonalArray1() {
        int[][] nullsArray = new int[5][5];
        for (int i = 0; i < nullsArray.length; i++) {
            for (int j = 0; j < nullsArray.length; j++) {
                if (i == j || i + j == nullsArray.length - 1) {
                    nullsArray[i][j] = 1;
                }
            }
        }
        for (int[] ints : nullsArray) {
            for (int j = 0; j < nullsArray.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    public static void minAndMaxElements() {
        int[] elementsInt = { 19, 16, 12, 10, 7, 9, 11 };
        int max = elementsInt[0];
        int min = elementsInt[0];
        for(int i = 0; i < elementsInt.length; i++) {
            if (elementsInt[i] > max) { /*
                                          * На каждой итерации цикла будет
                                          * сравниваться значение проходимого элемента со значением переменной,
                                          * которой присвоено значение первого элемента, если он будет больше чем max то к значению
                                          * этой переменной будет присвеоно значение этого проходимого элемента, и так
                                          * далее, пока не будет найден максимальный элемент. Аналогичное будет происходит
                                          * и с нахождением минимального элемента, а если же не будет кандидата на меньший или
                                          * больший элемент по отношению к перменной min или max то она таковой и останется и будет выведено ее значение.
                                         */
                max = elementsInt[i];
            }
            if(elementsInt[i] < min) {
                min = elementsInt[i];
            }
        }
        System.out.println("Минимальное число: " + min + " " + "Максимальное число: " + max);
    }
    public static boolean checkBalance(int[] array){
        int leftSum = 0;
        for(int i = 0; i < array.length; i++){
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++){
                rightSum += (j > i)? array[j] : 0;
            }
            if(leftSum == rightSum){
                return true;
            }
        }
        return false;
    }
    public static void shiftArray(int[] array, int value) {
        boolean direction;
        if (value < 0) {
            direction = true;
            value = -value;
        } else {
            direction = false;
        }
        value %= array.length;
        int last = array.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = (direction) ? array[0] : array[last];

            for (int j = 0; j < last; j++) {
                if (direction)
                    array[j] = array[j + 1];
                else
                    array[last - j] = array[last - j - 1];
            }

            if (direction)
                array[last] = temp;
            else
                array[0] = temp;
        }
    }
}

/*
TODO:
* 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
* 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
* 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
* 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
* 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
 */