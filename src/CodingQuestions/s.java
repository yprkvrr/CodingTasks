package CodingQuestions;

public class s {

    public static boolean length(String [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>=5){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String [] arr={"java","selenium","fun"};
        System.out.println(length(arr));
    }
}
