package assessments.Level1.Loops;

import java.util.Scanner;

public class GCD_HCF {

    static int gcd(int a, int b){
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {

        System.out.println("Enter the Numbers for GCD");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        System.out.println("GCD Value is "+ gcd(a,b));
        int hcf = 0;

        for(int i = 1; i <= a || i <= b; i++) {
            if( a%i == 0 && b%i == 0 )
                hcf = i;
        }
        System.out.println("HCF of given two numbers is ::"+hcf);
    }

}