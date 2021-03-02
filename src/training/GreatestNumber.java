package training;

import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int Num1 = scanner.nextInt();
        int Num2 = scanner.nextInt();
        int Num3 = scanner.nextInt();

        if((Num1>Num2)&&(Num1>Num3)){
            System.out.print("Number 1 is bigger : "+Num1);
        }
        else if ((Num2>Num1)&&(Num2>Num3)){
            System.out.print("Number 2 is bigger : "+Num2);
        }

        else if ((Num3>Num1)&&(Num3>Num2)){
            System.out.print("Number 3 is bigger : "+Num3);
        }

    }
}
