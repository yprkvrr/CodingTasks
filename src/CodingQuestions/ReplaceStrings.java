package CodingQuestions;

public class ReplaceStrings {
    public static String
    removeNonNumeric(String str){

        str = str.replaceAll( "[^0-9]", "");

        return str;
    }

    public static void main(String args[])
    {

        String str1 = "The dollar value for transaction id 567456 is $100";
        System.out.println(removeNonNumeric(str1));
    }
}
