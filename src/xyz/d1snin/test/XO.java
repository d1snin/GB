package xyz.d1snin.test;

public class XO {
    public static void main(String[] args) {
        System.out.println(getXO("xoxoxoxopgergherhgearaex"));
    }

    public static boolean getXO (String str) {

        String bufferX = "";
        String bufferO = "";
        boolean isNothing = true;
        String checkStr = str.toLowerCase();
        char[] strArray = checkStr.toCharArray();
        String test1 = "x";
        String test2 = "x";

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == 'x') {
                bufferX += strArray[i];
                isNothing = false;
            }
            if (strArray[i] == 'o') {
                bufferO += strArray[i];
                isNothing = false;
            }
        }
            if (bufferO.length() == bufferX.length()) {
                return true;
            }
            if (isNothing) {
                return true;
            }
        return false;

    }
}