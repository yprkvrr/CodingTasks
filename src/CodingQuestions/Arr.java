package CodingQuestions;

import java.util.Arrays;
import java.util.List;

public class Arr {

    public static int[] removeZeroToEnd(int[] arr) {

        int[] newArr = new int[arr.length];
        int n = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[n++] = arr[i];
            }

        }
        return newArr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(removeZeroToEnd(new int[]{0, 8, 0, 0, 7, 7})));
    }
}
