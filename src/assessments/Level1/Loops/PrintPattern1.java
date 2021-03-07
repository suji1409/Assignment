package assessments.Level1.Loops;

import java.util.Scanner;

public class PrintPattern1 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        String pattern = new Scanner(System.in).next();
        String temp = pattern;
        for (int i = 0; i < n; i++) {
            if(i>0) {
                temp=temp+pattern;
            }
            System.out.println(temp+"\n");

        }
    }
}
