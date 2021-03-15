package xyz.d1snin.codearchive.homeworks.level2.homework2;

public class Application {
    public static void main(String[] args) {
        String[][] array = {
                {"4", "43", "432", "426"},
                {"97", "592", "634", "85"},
                {"423", "90", "21", "67"},
                {"412", "12", "14", "21"}
        };
        try {
            System.out.println(converter(array));
        } catch (MyArraySizeException | MyArrayDataException exception) {
            exception.printStackTrace();
        }
    }
    private static int converter(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        boolean isRightArray = false;
        int sum = 0;
        for (String[] strings : arr) {
            isRightArray = strings.length == arr.length;
        }
        if(!isRightArray) {
            throw new MyArraySizeException();
        } else {
            for (int i = 0; i < arr.length; i ++) {
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException numberFormatException) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
        }
        return sum;
    }
}
