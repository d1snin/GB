package xyz.d1snin.codearchive.homeworks.level3.homework1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Swap
        SwapArray<Integer> swapArray = new SwapArray<>();
        Integer[] integers = {4213, 423, 42, 75, 236};
        System.out.println(Arrays.toString(swapArray.swap(integers, 2, 3)));
        SwapArray<String> swapArray1 = new SwapArray<>();
        String[] strings = {"fslkrnem", "rwfe"};
        System.out.println(Arrays.toString(swapArray1.swap(strings, 0, 1)));
        //Array to arraylist
        ArrayToArrayList<String> arrayToArrayList = new ArrayToArrayList<>();
        String[] arr = new String[] {
                "Gsr", "Fse", "Fgsea"
        };
        System.out.println(arrayToArrayList.toArrayList(arr));
    }
}
