package xyz.d1snin.codearchive.homeworks.level2.homework5;

import java.util.Arrays;

public class Main {

    private static final int size = 10000000;
    private static final int h = size / 2;

    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1() {
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }

    private static void method2() { //способ без обратной склейки двух массивов
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long start = System.currentTimeMillis();
        Thread t1  = new Thread(() -> {
            for (int i = 0; i < h; i++) {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < h; i++) {
                arr[i + h] = (float)(arr[i + h] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
//        printArr(arr);
    }
    private static void printArr(float [] arr) {
        for (float f : arr) {
            System.out.println(f);
        }
    }
}
