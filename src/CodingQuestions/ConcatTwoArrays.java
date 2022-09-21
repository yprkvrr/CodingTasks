package CodingQuestions;

import java.util.Arrays;

public class ConcatTwoArrays {
    public static int[] concat(int[] one, int[] two) {
        int[] result = new int[one.length + two.length];
        int i=0;
        for (int each:one){
            result[i++]=each;
        }
        for (int each:two){
            result[i++]=each;
        }
        return result;
    }

    public static void main(String[] args) {
        int[]firs={1,2,3};
        int[]second={4,5,6};
        System.out.println(Arrays.toString(concat(firs,second)));
    }
}
