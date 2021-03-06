package xyz.d1snin.gb.codeWars;

import java.util.Arrays;

public class DeadFish {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiisisoisosiiosis")));
    }
    public static int[] parse(String data) {
        int value = 0;
        int pointer = 0;
        int[] result = new int[(int) data.chars().filter(c -> c == 'o').count()];
        for (char c : data.toCharArray()) {
            if (c == 'i') value += 1;
            if (c == 'd') value -= 1;
            if (c == 's') value *= value;
            if (c == 'o') {
                result[pointer] = value;
                pointer++;
            }
        }
        return result;
    }
}
