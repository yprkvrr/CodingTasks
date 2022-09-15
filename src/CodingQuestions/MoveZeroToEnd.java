package CodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroToEnd {

    public static List<Integer> zeroNums(List<Integer> nums) {

        List<Integer> newNumbers = new ArrayList<>();
        int orgSize = nums.size();

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) != 0) {
                newNumbers.add(nums.get(i));
            }
        }
        int zeroSize=orgSize- newNumbers.size();
        for (int i = 0; i < zeroSize; i++) {
            newNumbers.add(0);
        }
        return newNumbers;
    }

    public static void main(String[] args) {
        System.out.println(zeroNums(Arrays.asList(0, 7, 0, 0, 6, 7, 8)));
    }
}
