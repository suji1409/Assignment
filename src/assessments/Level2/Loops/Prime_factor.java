package assessments.Level2.Loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime_factor {
    public static void main(String[] args) {
        boolean flag;
        int input;

        input = new Scanner(System.in).nextInt();

        ArrayList<Integer> Fact_Array = new ArrayList<>();

        for(int i = 1 ; i<=input;i++){
            if(input%i==0){
                Fact_Array.add(i);
            }
        }
        for (int Fact:Fact_Array){
            flag = false;
            for (int i = 2; i < Fact; i++) {
                // condition for nonprime number
                if (Fact % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(Fact + " is a prime Factor of Number : "+input);
            else
                System.out.println(Fact + " is not a prime Factor of Number : "+input);
        }
    }
}
