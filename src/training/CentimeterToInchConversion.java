package training;

import java.util.Scanner;

public class CentimeterToInchConversion {

    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            double converter = 0.394;
            double input = scanner.nextDouble();
            double inch = converter * input;
            System.out.print(inch);
            //1 cm = 0.354
    }
}
