package assessments.day4;

import java.util.Scanner;

public class CheckCaseOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        int AsciiCode = (int) input;
        if (AsciiCode>=65 && AsciiCode<=90) {
            System.out.println("Entered Character is Upper Case "+ input);
        } else if (AsciiCode>=97 && AsciiCode<=122) {
            System.out.println("Entered Character is Smaller Case" + input);
        }
    }
}
