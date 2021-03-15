package xyz.d1snin.codearchive.homeworks.level2.homework2;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i1, int i2) {
        super("Invalid format, all elements must contain only numbers: Exception in array[" + i1 + "][" + i2 + "]");
    }
}
