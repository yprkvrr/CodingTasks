package CodingQuestions;

import java.util.Arrays;

public class AddingArrayToArray {
    public static void main(String[] args) {
        String [] arr1={"A","B","C"};
        String []arr2=Arrays.copyOfRange(arr1,0,arr1.length);


      //  String []arr2=new String[arr1.length];
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i]=arr1[i];
//        }  --->LOOP WAY

        System.out.println(Arrays.toString(arr2));


    }
}
