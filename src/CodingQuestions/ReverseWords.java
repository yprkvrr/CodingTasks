package CodingQuestions;

public class ReverseWords {
    public static String str(String words) {
        StringBuilder reversed = new StringBuilder();

        String[] s = words.split(" ");

        for (int i = s.length - 1; i >= 0; i--) {
            reversed.append(s[i] + " ");

        }
        return reversed.toString().trim();

    }

    public static void main(String[] args) {
        System.out.println(str("hello how are you"));
    }
}
