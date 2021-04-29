package xyz.d1snin.codearchive.homeworks.level3.homework6;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest {

    public static Stream<Arguments> data() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(false, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
        out.add(Arguments.arguments(false, new int[]{4, 4, 4, 4, 4, 4, 4, 4}));
        out.add(Arguments.arguments(false, new int[]{0, 0, 0, 4}));
        out.add(Arguments.arguments(true, new int[]{1, 1, 4, 1, 4, 1, 1, 4, 4, 1}));
        out.add(Arguments.arguments(true, new int[]{1, 1, 1, 1, 4, 4, 4, 4, 4}));
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("data")
    public void isContainsOnlyOneAndFourTest(boolean b, int[] arr) {
        Assertions.assertEquals(b, Main.isContainsOnlyOneAndFour(arr));
    }
}
