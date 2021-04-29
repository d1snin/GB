package xyz.d1snin.codearchive.homeworks.level3.homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(getArrAfterFour(new int[]{5, 53, 42, 2, 42, 6, 7, 4})));
            System.out.println(isContainsOnlyOneAndFour(new int[]{1,4,1,4,1,4,4,1,1,1,1}));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static boolean isContainsOnlyOneAndFour(int[] array) {

        boolean contains1 = false;
        boolean contains4 = false;

        for (int i : array) {
            if (i != 1 && i != 4) {
                return false;
            }

            if (i == 1) contains1 = true;
            if (i == 4) contains4 = true;
        }
        return contains1 && contains4;
    }

    public static int[] getArrAfterFour(int[] array) {

        int count = 0;

        List<Integer> result = new ArrayList<>();

        for (int i : array) {
            if (i == 4) count++;
        }

        if (count == 0) throw new RuntimeException("Array without '4'");

        for (int i : array) {
            if (i == 4) count--;

            if (count == 0) {
                result.add(i);
            }
        }

        int[] res = new int[result.size() - 1];

        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i + 1);
        }

        return res;
    }
}
