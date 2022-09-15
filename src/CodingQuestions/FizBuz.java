package CodingQuestions;

public class FizBuz {
   /** FizzBuzz: Write a program that takes 1 parameter, maxNumber, and prints a sequence of numbers from 1 - maxNumber and replaces 3/5 multiples with the following
    maxNumber should be a variable that can be changed
3 Fizz
5 Buzz
    */
   public void  nums(int maxNumber){
       for (int i = 1; i <= maxNumber; i++) {
           if (i==3){
               System.out.println("Fizz");
           }else if(i==5){
               System.out.println("Buzz");
           }
           System.out.println(i);
       }

   }

    public static void main(String[] args) {
        FizBuz fizBuz=new FizBuz();
        fizBuz.nums(8);

    }
}
