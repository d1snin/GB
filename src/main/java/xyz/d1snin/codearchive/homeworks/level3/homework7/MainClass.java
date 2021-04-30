package xyz.d1snin.codearchive.homeworks.level3.homework7;

import xyz.d1snin.codearchive.homeworks.level3.homework7.annotation.AfterSuite;
import xyz.d1snin.codearchive.homeworks.level3.homework7.annotation.BeforeSuite;
import xyz.d1snin.codearchive.homeworks.level3.homework7.annotation.Test;

public class MainClass {

    @Test(priority = 6)
    public static void test1() {
        System.out.println("Method #1");
    }

    @Test(priority = 3)
    public static void test2() {
        System.out.println("Method #2");
    }

    @BeforeSuite
    public static void test3() {
        System.out.println("Method with @BeforeSuite");
    }

    @AfterSuite
    public static void test4() {
        System.out.println("Method with @AfterSuite");
    }

    @Test(priority = 8)
    public static void test5() {
        System.out.println("Method #5");
    }

    public static void main(String[] args) {
        try {
            MainTest.start(MainClass.class);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
