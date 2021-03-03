package xyz.d1snin.gb.codeWars;

public class JadenCase {
    public static void main(String[] args) {
        System.out.println(toJadenCase(""));
    }

    public static String toJadenCase(String phrase) {
        try {
            try {
                String[] phraseArray = phrase.split("\\W+");
                String convertedPhrase = "";
                for (int i = 0; i < phraseArray.length; i++) {
                    String ez = converter(phraseArray[i]);
                    convertedPhrase += ez + " ";
                }
                return convertedPhrase.substring(0, convertedPhrase.length() - 1);
            } catch (NullPointerException e) {
                return null;
            }
        } catch (StringIndexOutOfBoundsException a) {
            return null;
        }
    }
    public static String converter(String word) {
        String wordInverted = "";
        String ezWord = word.substring(0, word.length() - 1);
        String wordReturn = word.substring(1);


            //Get the char as a substring
            char subChar = ezWord.charAt(0);

            if (Character.isLowerCase(subChar))
            {
                subChar = Character.toUpperCase(subChar);
            }
            else
            {
                subChar = Character.toLowerCase(subChar);
            }

            wordInverted += (subChar + wordReturn); //Add the newly inverted character to the inverted string


        return wordInverted;
    }
}