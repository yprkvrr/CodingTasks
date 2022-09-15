package CodingQuestions;

import java.util.Arrays;

public class x {
    public static void main(String[] args) {
        String str = "java";
        String[] s = str.split("");
        System.out.println(Arrays.toString(s));
        String ss=str.substring(1,str.length()-1);
        System.out.println(ss);
        String mm=str.charAt(str.length()-1)+ss+str.charAt(0);
        System.out.println(mm);
    }
}
