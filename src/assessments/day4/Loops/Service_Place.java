package assessments.day4.Loops;

import java.util.Scanner;

public class Service_Place {

    public static void main(String[] args) {

        System.out.println("Enter the Following Details of the Employee in below " +
                           "format : Age, Sex(M/F), Marital Status (Y/N)");

        int Age = new Scanner(System.in).nextInt();
        char Sex = new Scanner(System.in).next().charAt(0);
        char Marital_Status = new Scanner(System.in).next().charAt(0);

        if(Sex=='F' && Age > 20){
            System.out.println("Female Employee aged above 20 will work in Urban Areas");
        }
        else if(Sex=='F' && Age < 20){
            System.out.println("ERROR");
        }
        if(Sex=='M') {
            if (Sex == 'M' && (Age > 40 && Age < 60)) {
                System.out.println("Male Employee aged between 40 and 60 will work in Urban Areas");
            } else if (Sex == 'M' && (Age > 20 && Age < 40)) {
                System.out.println("Male Employee aged between 20 and 40 will work in Any Area");
            }
            else{
                System.out.println("ERROR");
            }
        }

    }

}