package xyz.d1snin.codearchive.homeworks.level3.homework1;

public class SwapArray<T> {
    public T[] swap(T[] arr, int i1, int i2) {
        T buffer = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = buffer;
        return arr;
    }
}
