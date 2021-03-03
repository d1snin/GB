package xyz.d1snin.gb.homework2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать, у вас 3 попытки.");
        for (int x = 0; x < 3; x++) {
            game();
        }
        System.out.println("Вы проиграли, начать игру заново? 1 - да, 0 - нет.");
        exitOrReplay();
    }
    @SuppressWarnings("InfiniteLoopStatement")
    public static void game() {
        System.out.println("Угадайте число, заданное в диапазоне от 0 до 10!");
        Random rand = new Random();
        int random = rand.nextInt(11);
        int guess;
        int tries = 0;
        while (true) {
            tries++;
            guess = readIntegerFromConsole();
            if (guess < random) {
                System.out.println("Загаданное число больше.");
                loseChecker(tries);
            } else if (guess > random) {
                System.out.println("Загаданное число меньше.");
                loseChecker(tries);
            } else if (guess == random) {
                System.out.println("Вы выиграли, начать заново? 1 - да, 0 - нет.");
                exitOrReplay();
            }
        }
    }


    public static int readIntegerFromConsole() {
        do {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                return scan.nextInt();
            }
            scan.nextLine();
        } while (true);
    }

    public static void exitOrReplay() {
        int answer = readIntegerFromConsole();
        if (answer == 0) {
            System.exit(0);
        } else if (answer == 1) {
            game();
        }
    }

    public static void loseChecker(int a) {
        if (a > 2) {
            System.out.println("Игра окончена, начать заново? 1 - да, 0 - нет.");
            exitOrReplay();
        }
    }
}