package CodingQuestions;

public class MaxMinArray {
    public static int maxNum(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                num = arr[i];
            }

        }
        return num;
    }

    public static int minNum(int[] arr) {
        int num=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<num){
                num=arr[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 99};
        System.out.println(maxNum(arr));
        System.out.println(minNum(arr));
    }
}
