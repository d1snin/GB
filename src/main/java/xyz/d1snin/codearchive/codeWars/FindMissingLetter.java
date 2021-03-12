package xyz.d1snin.codearchive.codeWars;

public class FindMissingLetter {
    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[]{'O','Q','R','S'}));
    }
    public static char findMissingLetter(char[] array) {
        char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        int firstCharAlphabetIndex = new String(alphabet).indexOf(Character.toLowerCase(array[0]));
        int counter = 0;
        char res = ' ';
        for (int i = firstCharAlphabetIndex; i < array.length + firstCharAlphabetIndex; i++) {
            if (alphabet[i] != Character.toLowerCase(array[counter])) {
                res = Character.isLowerCase(array[0]) ? alphabet[i] : Character.toUpperCase(alphabet[i]);
                return res;
            }
            counter++;
        }
        return res;
    }
}
