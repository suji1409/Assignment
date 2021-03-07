package assessments.day4.Loops;

import java.util.Scanner;

public class Print_ASCII_Equivalent {
    public static void main(String[] args) {
        int input = new Scanner(System.in).nextInt();
        if(input>=0 && input<=255) {
            System.out.println((char)(input));
        }

    }
}
