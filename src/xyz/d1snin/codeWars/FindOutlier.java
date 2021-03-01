package xyz.d1snin.codeWars;

public class FindOutlier {
    public static void main(String[] args) {
        int[] abc = { 3, 7, 9, 11, 2 };
        System.out.println(find(abc));
    }
    static int find(int[] integers){
        if (isOdd(integers)) {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 != 0) {
                    return integers[i];
                }
            }
        }
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                return integers[i];
            }
        }
        return 0;
    }
    static boolean isOdd(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
            if (counter == 2) {
                return true;
            }
        }
        return false;
    }
}
