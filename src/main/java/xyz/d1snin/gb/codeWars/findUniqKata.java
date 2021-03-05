package xyz.d1snin.gb.codeWars;

import java.util.Random;

public class findUniqKata {
    public static void main(String[] args) {
        double[] array = { 0, 1, 1, 1, 1, 1, 1, 1 };
        System.out.println(findUniq(array));
    }
    public static double findUniq(double arr[]) {
        double buf = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) { //
                if (arr[i] != arr[j]) {
                    Random random = new Random();
                    if (arr[i] == arr[random.nextInt(arr.length)]) { // <-- this should be redone to avoid accidental mistakes
                        return arr[j];
                    } else {
                        buf = arr[i];
                        return buf;
                    }
                }
            }
        }
        return buf;
    }
}
