package xyz.d1snin.codearchive.homeworks.level1.homework4;

import java.util.Random;
import java.util.Scanner;

public class TicTac {

        public static int SIZE = 3;

    public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';

        public static char[][] map;

        public static Scanner sc = new Scanner(System.in);
        public static Random rand = new Random();

        public static String buffer;
@SuppressWarnings("InfiniteLoopStatement")
        public static void main(String[] args) {
            do {
                game();
                System.out.println("Желаете выйти из игры? 0 - да, 1 - нет");
                exitOrReplay();
            } while (true);
        }

        public static void game() {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWinRewrite(DOT_X)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWinRewrite(DOT_O)) {
                    System.out.println("Победил Искуственный Интеллект");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }

        public static void exitOrReplay() {
            int answer = sc.nextInt();
            if (answer == 0) {
                System.exit(0);
            }
        }

        public static boolean checkWinRewrite(char symbol) {
            String winComb = Character.toString(symbol) + symbol + symbol;
            for (int x = 0; x < map.length; x++) {
                buffer = Character.toString(map[0][x]) + map[1][x] + map[2][x];
                if (buffer.equals(winComb)) {
                    return true;
                }
                buffer = Character.toString(map[x][0]) + map[x][1] + map[x][2];
                if (buffer.equals(winComb)) {
                    return true;
                }
                buffer = Character.toString(map[0][0]) + map[1][1] + map[2][2];
                if (buffer.equals(winComb)) {
                    return true;
                }
                sideCheck();
                if (buffer.equals(winComb)) {
                    return true;
                }
            }
            return false;
        }
@SuppressWarnings("StringConcatenationInLoop")
        public static void sideCheck() {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if (i + j == map.length - 1) {
                        buffer += map[i][j];
                    }
                }
            }
        }

        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }
        public static void aiTurn() {
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }
        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
            map[y][x] = DOT_X;
        }
        @SuppressWarnings("BooleanMethodIsAlwaysInverted")
        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
            return map[y][x] == DOT_EMPTY;
        }
        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        public static void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
}