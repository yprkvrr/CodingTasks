package CodingQuestions;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        //        int n=nums.length;
//        int sum=((n+1)*(n+2))/2;//55
//        for(int i=0;i<n;i++)
//            sum-=arr[i];
//        return sum;
        int ExpectedSum = 55;

        int actualSum = 0;


        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];

        }

        return ExpectedSum - actualSum;


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(missingNumber(arr));
    }
}
