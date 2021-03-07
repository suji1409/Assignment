package assessments.Level1.ConditionalStatement;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int yearService;
        yearService = sc.nextInt();
        int salary = sc.nextInt();
        if(yearService > 5){
            int bonus = (salary*5)/100;
            System.out.println(bonus);

            salary = bonus+salary;
            System.out.println("Salary is "+ salary);

        }else{
            System.out.println("Salary is "+ salary);
        }


    }


}
