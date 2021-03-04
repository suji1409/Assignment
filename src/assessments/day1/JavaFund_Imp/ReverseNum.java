package assessments.day1.JavaFund_Imp;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int reminder=0, reverseNo = 0;
        int Original = sc.nextInt();
        while (Original!=0) {
            reminder = Original % 10;
            reverseNo = reverseNo * 10 + reminder;
            Original = Original / 10;
        }
        System.out.println("Reversed Number is "+reverseNo);

    }
}
