package training;

import java.util.Scanner;

public class GrossPayCalculation {
    public static void main(String[] args){

        Scanner wagePerHour, totalHours;
        System.out.println("Enter the Wage per hour for employee");
        wagePerHour = new Scanner(System.in);
        System.out.println("Enter the total hours for employee");
        totalHours = new Scanner(System.in);

        double wage;
        int hours;

        wage = wagePerHour.nextDouble();
        hours = totalHours.nextInt();

        double GrossPay;
        GrossPay = wage*hours;
        System.out.print("GrossPay of employee is " + GrossPay);

    }
}
