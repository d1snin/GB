package xyz.d1snin.codearchive.homeworks.level2.homework2;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Array does not fit 4x4");
    }
}
