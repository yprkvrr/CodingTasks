package CodingQuestions;

public class Anagram {
    public static boolean anagram(String strOne,String strTwo){



        if (strOne.length()==strTwo.length()){
            for (int i = 0; i < strOne.length(); i++) {
                char c=strOne.charAt(i);
                strTwo=strTwo.replace(c+"","");

            }if (strTwo.isEmpty()){
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        System.out.println(anagram("silent","listen"));
    }
}
