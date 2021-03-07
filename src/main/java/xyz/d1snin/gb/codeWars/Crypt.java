package xyz.d1snin.gb.codeWars;

public class Crypt {
    public static void main(String[] args) {
        System.out.println(encryptThis(""));
    }
    public static String encryptThis(String text) {
        String[] wordsArr = text.split(" ");
        String result = "";
        if (text.length() == 0) {
            return "";
        }
        for (int i = 0; i < wordsArr.length; i++) {
            int ascii = wordsArr[i].charAt(0);
            String secondChar = wordsArr[i].length() <= 2 ? "" : Character.toString(wordsArr[i].charAt(1));
            char lastChar = wordsArr[i].charAt(wordsArr[i].length() - 1);
            String buf = wordsArr[i].length() > 2 ? wordsArr[i].substring(2, wordsArr[i].length() - 1) : "";
            result += wordsArr[i].length() > 1 ? Integer.toString(ascii) + lastChar + buf + secondChar + " " : ascii + " ";
        } return removeCharAt(result, result.length() - 1);
    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}