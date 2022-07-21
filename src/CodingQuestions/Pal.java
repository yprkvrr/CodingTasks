package CodingQuestions;

public class Pal {
    public static boolean isPalindrome(int x) {
        boolean isPalindromeNum = false;

        String str = Integer.toString(x);
        StringBuilder reverseStr = new StringBuilder(str);
        String reversedNum = reverseStr.reverse().toString();
        if (reversedNum.equals(str))
            isPalindromeNum = true;

        return isPalindromeNum;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
