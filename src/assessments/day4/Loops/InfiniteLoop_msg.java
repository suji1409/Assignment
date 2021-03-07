package assessments.day4.Loops;

import java.util.ArrayList;
import java.util.Scanner;

public class InfiniteLoop_msg {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
       int i = 1;
       while(i>0){
           System.out.println("Infinite Loop Counter "+i);
           i++;
       }
    }
}
