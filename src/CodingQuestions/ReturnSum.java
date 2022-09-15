package CodingQuestions;

public class ReturnSum {
    public static void main(String[] args) {
        String  s="1a2b3c4f!@#";
        int sum=0;
        String letter="";
        String digit="";

        for (int i = 0; i < s.length(); i++) {
            char letter1=s.charAt(i);
            if (Character.isDigit(letter1)){
                sum+=Integer.parseInt(letter1+"");
                digit+=letter1;

            } else {
                Character.isLetter(letter1);
                letter += letter1 + " ";
            }

        }
        System.out.println(sum);
    }


    }
