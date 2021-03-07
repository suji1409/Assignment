package assessments.day4.Loops;

import java.util.Scanner;

public class Generate_Armstrong {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            int input_No = i, sum = 0;
            int cube_val = 0, digit = 0;

            while (input_No != 0) {
                digit = input_No % 10;
                cube_val = digit * digit * digit;
                sum = sum + cube_val;
                input_No = input_No / 10;
            }

            if (sum == i) {
                System.out.println(sum + " is an Armstromg Number");
            }
        }
    }
}
