package xyz.d1snin.gb.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClass {
    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {
        try {
            while (true) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Добро пожаловать.");
                System.out.println("Задание 1:");
                System.out.println("Введите поочередно элементы массива (массив состоит из 5 элементов)");
                int arrayReplace1 = scan.nextInt();
                int arrayReplace2 = scan.nextInt();
                int arrayReplace3 = scan.nextInt();
                int arrayReplace4 = scan.nextInt();
                int arrayReplace5 = scan.nextInt();
                System.out.println("Результат к заданию 1:");
                int[] arrayReplace = {arrayReplace1, arrayReplace2, arrayReplace3, arrayReplace4, arrayReplace5};
                arrayReplace1and0(arrayReplace);
                System.out.println("Задание 2:");
                System.out.println("Введите размер массива");
                int arrayFillSize = scan.nextInt();
                System.out.println("Результат к заданию 2:");
                int[] arrayForFillArray = new int[arrayFillSize];
                fillArray(arrayForFillArray);
                System.out.println("Задание 3:");
                System.out.println("Введите поочередно элементы массива (массив состоит из 5 элементов)");
                int ifLessMultiple1 = scan.nextInt();
                int ifLessMultiple2 = scan.nextInt();
                int ifLessMultiple3 = scan.nextInt();
                int ifLessMultiple4 = scan.nextInt();
                int ifLessMultiple5 = scan.nextInt();
                System.out.println("Результат к заданию 3:");
                int[] ifLess6Multiple2Array = {ifLessMultiple1, ifLessMultiple2, ifLessMultiple3, ifLessMultiple4, ifLessMultiple5};
                ifLess6Multiple2(ifLess6Multiple2Array);
                System.out.println("Задание 4:");
                System.out.println("Введите размер двумерного массива (так как размер массива строк и столбцов должен совпадать, будет взято одно число)");
                int diagonalArraySize = scan.nextInt();
                System.out.println("Результат к заданию 4:");
                diagonalArray1(diagonalArraySize);
                System.out.println("Задание 5:");
                System.out.println("Введите поочередно элементы массива (массив состоит из 5 элементов)");
                int arrayMinMax1 = scan.nextInt();
                int arrayMinMax2 = scan.nextInt();
                int arrayMinMax3 = scan.nextInt();
                int arrayMinMax4 = scan.nextInt();
                int arrayMinMax5 = scan.nextInt();
                System.out.println("Результат к заданию 5:");
                int[] arrayMinAndMax = {arrayMinMax1, arrayMinMax2, arrayMinMax3, arrayMinMax4, arrayMinMax5};
                minAndMaxElements(arrayMinAndMax);
                System.out.println("Задание 4:");
                System.out.println("Введите поочередно элементы массива (массив состоит из 5 элементов)");
                int checkBalance1 = scan.nextInt();
                int checkBalance2 = scan.nextInt();
                int checkBalance3 = scan.nextInt();
                int checkBalance4 = scan.nextInt();
                int checkBalance5 = scan.nextInt();
                System.out.println("Результат к заданию 6:");
                int[] arrayCheckBalance = {checkBalance1, checkBalance2, checkBalance3, checkBalance4, checkBalance5};
                System.out.println(checkBalance(arrayCheckBalance));
                System.out.println("Задание 7:");
                System.out.println("Введите поочередно элементы массива (массив состоит из 5 элементов)");
                int shiftArray1 = scan.nextInt();
                int shiftArray2 = scan.nextInt();
                int shiftArray3 = scan.nextInt();
                int shiftArray4 = scan.nextInt();
                int shiftArray5 = scan.nextInt();
                System.out.println("Результат к заданию 7:");
                int[] shiftArray = {shiftArray1, shiftArray2, shiftArray3, shiftArray4, shiftArray5};
                shiftArray(shiftArray, -2);
                System.out.println(Arrays.toString(shiftArray));
            }
            } catch (Exception e) {
            System.out.println("Что-то пошло не так, попробуйте еще раз.");
        }
    }

    public static void fillArray(int[] q) {
        int x = 0;
        for (int i = 0; i < q.length; i++) {
            q[i] = x;
            x += 3;
        }
        System.out.println(Arrays.toString(q));
    }

    public static void arrayReplace1and0(int[] y) {
        for (int i = 0; i < y.length; i++) {
            if (y[i] == 1) {
                y[i] = 0;
            } else if (y[i] == 0) {
                y[i] = 1;
            }
        }
        System.out.println(Arrays.toString(y));
    }

    public static void ifLess6Multiple2(int[] z) {
        for (int i : z) { //idea говорит мне что можно заменить обычный цикл for на расширенный, поэтому я сделал это, не люблю варны.
            if (i <= 6) {
                System.out.println(i * 2);
            }
        }
    }

    public static void diagonalArray1(int p) {
        int[][] nullsArray = new int[p][p];
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
    public static void minAndMaxElements(int[] a) {
        int max = a[0];
        int min = a[0];
        for (int j : a) {
            if (j > max) { /*
             * На каждой итерации цикла будет
             * сравниваться значение проходимого элемента со значением переменной,
             * которой присвоено значение первого элемента, если он будет больше чем max то к значению
             * этой переменной будет присвеоно значение этого проходимого элемента, и так
             * далее, пока не будет найден максимальный элемент. Аналогичное будет происходит
             * и с нахождением минимального элемента, а если же не будет кандидата на меньший или
             * больший элемент по отношению к перменной min или max то она таковой и останется и будет выведено ее значение.
             */
                max = j;
            }
            if (j < min) {
                min = j;
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