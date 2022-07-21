package CodingQuestions;

import java.util.Arrays;

public class AnagramDifferent {
    public static boolean isAnagram(String str1,String str2){
        char [] first=str1.toLowerCase().toCharArray();
        char [] second=str2.toLowerCase().toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);
      return Arrays.equals(first,second);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("ana", "naa"));
    }
}
