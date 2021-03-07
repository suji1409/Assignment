package assessments.day4.Loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Verify_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();

        while(sc.hasNext() && sc.hasNextInt()){
            if(sc.hasNextInt()){
                input.add(sc.nextInt());
            }
        }

        int Sum = 0; int prod_Val = 1;
        for (int arr_Val:input) {
            Sum = Sum + arr_Val;
            prod_Val = prod_Val*arr_Val;
        }

        int Avg = Sum/input.size();
        System.out.println("Average of Entered Numbers is "+ Avg);
        System.out.println("Product of Entered Numbers is "+prod_Val);

    }
}
