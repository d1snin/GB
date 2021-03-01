package xyz.d1snin.codeWars;

public class KataGetMiddle {
    public static void main(String[] args) {
        System.out.println(getMiddle("aaabaa"));
    }
    public static String getMiddle(String word) {
        if (isOdd(word.length())) {
            int lol = (word.length() - 1) / 2;
            return word.substring(lol, lol + 1);
        }
        int lolTwo = (word.length() - 2) / 2;
        return word.substring(lolTwo, lolTwo + 2);
    }
    static boolean isOdd(int integer) {
        if (integer % 2 == 0) {
            return false;
        }
        return true;
    }
}
