package xyz.d1snin.codeWars;

public class Kata {
    public static void main(String[] args) {
        System.out.println(findShort("ffsen emf  ofeomfe ofe"));
    }
    public static int findShort(String s) {
        String[] arrayWords = s.split("\\W+");
        int min = arrayWords[0].length();
        for (int j = 0; j < arrayWords.length; j++) {
            if (arrayWords[j].length() < min) {
                min = arrayWords[j].length();
            }
        }
        return min;
    }
}
