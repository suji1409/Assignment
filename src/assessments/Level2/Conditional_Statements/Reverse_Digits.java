package assessments.Level2.Conditional_Statements;

import java.util.Scanner;

public class Reverse_Digits {
    public static void main(String[] args) {

        System.out.println("Enter the Number");

        int input_No = new Scanner(System.in).nextInt();
        int seperate_Digits = 0;
        int reverse_no=0;
        while(input_No!=0){
            seperate_Digits = (input_No%10);
            reverse_no = reverse_no*10+seperate_Digits;
            input_No=input_No/10;
       }
        System.out.println("Reverse of Digits is "+reverse_no);
    }

}