package xyz.d1snin.codearchive.homeworks.level2.homework3;

public class CantFindException extends RuntimeException {
    public CantFindException() {
        super("Can't find this contact!");
    }
}
