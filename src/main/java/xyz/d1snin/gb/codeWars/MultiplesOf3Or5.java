package xyz.d1snin.gb.codeWars;

public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
    public static int solution(int number) {
        int[] numbersInNum = getNumbers(number);
        int pointer = 0;
        for (int k : numbersInNum) {
            if (k == 0 || k == numbersInNum[numbersInNum.length - 1]) {
                continue;
            }
            if (k % 3 == 0 || k % 5 == 0) {
                pointer++;
            }
        } //what im doing.
        int[] results = new int[pointer];
        int counter = 0;
        for (int j : numbersInNum) {
            if (j == 0 || j == numbersInNum[numbersInNum.length - 1]) {
                continue;
            }
            if (j % 3 == 0 || j % 5 == 0) {
                results[counter] = j;
                counter++;
            }
        }
        int sum = 0;
        for (int result : results) {
            sum = sum + result;
        }
        return sum;
    }
    public static int[] getNumbers(int num) {
        int[] result = new int[num + 1];
        for(int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;
    }
}
