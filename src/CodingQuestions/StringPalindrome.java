package CodingQuestions;

public class StringPalindrome {
    public static boolean palindrome(String str) {

        String s="";

        for (int i =str.length()-1; i >=0 ; i--) {
            s+=str.charAt(i);
        }
        if (s.equals(str)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("anna"));
    }
}
