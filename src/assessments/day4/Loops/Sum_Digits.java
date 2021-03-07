package assessments.day4.Loops;

import java.util.Scanner;

public class Sum_Digits {
    public static void main(String[] args) {

        System.out.println("Enter the Number");

        int input_No = new Scanner(System.in).nextInt();
        int m = 1, sum =0;
       while(input_No>0){

           sum = sum + (input_No%10);
           input_No  = input_No/10;
       }

        System.out.println("Sum of Digits is "+sum);
    }

}