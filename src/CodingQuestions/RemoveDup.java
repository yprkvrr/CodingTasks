package CodingQuestions;

public class RemoveDup {
    public static String str(String removed){
        String words="";
        for (int i = 0; i < removed.length(); i++) {
            if (!words.contains(removed.charAt(i)+"")){
                words+=removed.charAt(i);
            }
        }
        return words;
    }

    public static void main(String[] args) {
        System.out.println(str("hello"));
    }
}
