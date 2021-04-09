package xyz.d1snin.codearchive.homeworks.level3.homework1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList<T> {
    public ArrayList toArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
