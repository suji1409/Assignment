package assessments.Level1.Loops;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {

        System.out.println("Enter No of Rows for Multiplication Table");
        int Row_Val = new Scanner(System.in).nextInt();

        int num1=24,num2=50,num3=29;
        int[] numArray = {num1,num2,num3};
        int Multiply_Value;
        for (int num : numArray) {
            System.out.println("Multiplication Table of "+num +"\n");
            for (int i = 1; i <=Row_Val ; i++) {
                Multiply_Value = num*i;
                System.out.println(num+"*"+i+"="+Multiply_Value+"\n");
            }
        }


    }
}
