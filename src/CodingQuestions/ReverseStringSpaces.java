package CodingQuestions;

public class ReverseStringSpaces {

    public static String reverseWords(String s){

        String [] arr = s.trim().split(" ");

        String reversed = "";
        for(String each : arr){

            for (int i = each.length()-1; i >= 0 ; i--) {

                reversed += each.charAt(i);
            }
            reversed += " ";
        }

        return reversed;

    }

    public static void main(String[] args) {
        System.out.println( reverseWords("this is interview"));
    }
}
