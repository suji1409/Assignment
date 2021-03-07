package assessments.Level1.Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Enter the Number for Factorial");

        int Fact_no = new Scanner(System.in).nextInt();
        long Fact_Val=1;

        for(int i=1; i<Fact_no; i++){
            if(i==1){
                Fact_Val = i*(i+1);
            }
            if(i>1){
                Fact_Val = Fact_Val*(i+1);
            }
        }

        System.out.println("Factorial Value is "+Fact_Val);
    }

}