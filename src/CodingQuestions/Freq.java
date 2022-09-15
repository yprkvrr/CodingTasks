package CodingQuestions;

public class Freq {
  public static String frequencyOfCharacters(String str){
        /*
        1)String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */
        int count = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String s = str.charAt(i) + "";
            if (result.contains(s)) {
                continue;
            } else {
                for (int j = 0; j < str.length(); j++) {
                    if (s.equals(str.charAt(j) + "")) {
                        count++;
                    }
                }
            }
            result += s + count;
            count = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("helloo"));
    }


    
}


