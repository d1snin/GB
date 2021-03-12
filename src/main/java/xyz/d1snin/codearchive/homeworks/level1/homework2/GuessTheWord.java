package xyz.d1snin.codearchive.homeworks.level1.homework2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать, ваша задача - угадать слово. Начинайте!");
        Game();
    }

    public static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    public static Random random = new Random();
    public static Scanner scan = new Scanner(System.in);
    public static String bars = "###############";
    public static char[] barsChars = bars.toCharArray();

    @SuppressWarnings("EmptyCatchBlock")
    public static void Game() {
        String guessedWord = generateNewWord();
        System.out.println(guessedWord + " - загаданное слово, для дебага");
        while (true) {
            try {
                String guess = scan.nextLine();
                if (guess.equals(guessedWord)) {
                    System.out.println("Вы выиграли! Было задуманно слово " + guessedWord);
                    System.exit(0);
                } else if (!guess.equals(guessedWord)) {
                    System.out.println("Попробуйте еще раз.");
                    for (int i = 0; i < guessedWord.length() - 1; i++) {
                        if (guessedWord.charAt(i) == guess.charAt(i)) {
                            barsChars[i] = guess.charAt(i);
                        }
                    }
                }
                System.out.println(barsChars);
            } catch (StringIndexOutOfBoundsException e) {
        }
    }

}
    public static String generateNewWord () {
        int wordsRand = random.nextInt(words.length);
        return words[wordsRand];
    }
}

/* TODO:
 * Создать массив из слов
 * String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
 * При запуске программы компьютер загадывает слово, запрашивает ответ у
 * пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
 * Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
 * apple – загаданное
 * apricot - ответ игрока
 * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
 * Для сравнения двух слов посимвольно можно пользоваться:
 * String str = "apple";
 * char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
 * Играем до тех пор, пока игрок не отгадает слово.
 * Используем только маленькие буквы.
 */