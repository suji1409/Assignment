package assessments.day4.Loops;

import java.util.Scanner;

public class Sum_Odd_Even_Digits {
    public static void main(String[] args) {

        System.out.println("Enter the Number");

        int input_No = new Scanner(System.in).nextInt();
        int seperate_Digits = 0;
        int odd_Sum=0,even_Sum=0;
        while(input_No!=0){
            seperate_Digits = (input_No%10);
            if(seperate_Digits%2==0){
                even_Sum=even_Sum+seperate_Digits;
            }else{
                odd_Sum= odd_Sum+seperate_Digits;
            }
            input_No=input_No/10;
       }

        System.out.println("Sum of Even Digits is "+even_Sum);
        System.out.println("Sum of Odd Digits is "+odd_Sum);
    }

}