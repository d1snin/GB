package xyz.d1snin.codearchive.codeWars;

public class isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("isogram"));
    }
    public static boolean  isIsogram(String str) {
        if (str.length() == 0) {
            return true;
        }
        char[] charArr = str.toLowerCase().toCharArray();
        int lol = 0;
        for (int i = 0; i < charArr.length; i++) {
            char buffer = charArr[i];
            lol = 0;
            for (int j = 0; j < charArr.length; j++) {
                if (charArr[j] == buffer) {
                    lol++;
                    if (lol == 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
