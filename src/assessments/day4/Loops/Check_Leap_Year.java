package assessments.day4.Loops;

import java.util.Scanner;

public class Check_Leap_Year {
    public static void main(String[] args) {

        System.out.println("Enter the Year");

        int input_Year = new Scanner(System.in).nextInt();
        if(input_Year%100==0){
            if(input_Year%400==0){
                System.out.println("Entered Century year is a Leap Year");
            }
            else{
                System.out.println("Entered Century year is NOT a Leap Year");
            }
        }
        else if(input_Year%4==0) {
            System.out.println("Entered year is a Leap Year");
        }
        else {
            System.out.println("Entered year is NOT a Leap Year");
        }
    }

}