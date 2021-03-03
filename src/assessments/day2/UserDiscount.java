package assessments.day2;

import java.util.Scanner;

public class UserDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt()*100;
        if(quantity >=1000 ){
            int Temp = (quantity*10)/100;
            System.out.println(Temp);
            quantity = quantity - Temp;
            System.out.println("The user gets Discount of 10% and the total price is "+ quantity);
        }
        else{
            System.out.println("The user isnt provided any discount for Cost "+ quantity);
        }
    }
}
