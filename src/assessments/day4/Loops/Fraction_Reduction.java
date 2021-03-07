package assessments.day4.Loops;

import java.util.Scanner;

public class Fraction_Reduction {
    public static void main(String[] args) {

        System.out.println("Enter the Numbers of Fraction");

        int Num_No = new Scanner(System.in).nextInt();
        int Denom_No = new Scanner(System.in).nextInt();
        int Reduced_Num_No;
        int Reduced_Denom_No;

        if(Num_No<Denom_No){
            Reduced_Num_No = Num_No/Num_No;
        }else
        {
            Reduced_Num_No=Num_No/Denom_No;

        }if(Denom_No<Num_No){
            Reduced_Denom_No = Denom_No/Denom_No;
        }
        else{
            Reduced_Denom_No = Denom_No/Num_No;
        }

        System.out.println("Reduced Fraction value is "+Reduced_Num_No +"/" +Reduced_Denom_No);
    }

}