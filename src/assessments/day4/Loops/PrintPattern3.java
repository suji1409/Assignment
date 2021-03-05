package assessments.day4.Loops;

import java.util.Scanner;

public class PrintPattern3 {
    public static void main(String[] args) {
        long base = 1010101;
        do {
            System.out.println(base);
            base = base / 100;
        } while(base > 0);

    }
}
