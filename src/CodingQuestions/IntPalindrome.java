package CodingQuestions;

public class IntPalindrome {
    public static boolean isPalindromeInt(int number){
        String reversed="";
        String origin=String.valueOf(number);

        for (int i =origin.length()-1; i >=0 ; i--) {
            reversed+=origin.charAt(i);

        }if (reversed.equals(origin)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeInt(122));
    }
}
