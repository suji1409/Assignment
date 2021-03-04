package assessments.day1.JavaFund_Imp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RandomInputAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> intArray = new ArrayList<>();
        int SumArray = 0;
        for(int i = 0; i<10; i++){
            intArray.add(sc.nextInt());
            if(i>0 && i==1){
                SumArray = intArray.get(i-1)+intArray.get(i);
            }else if (i>1){
                SumArray = SumArray + intArray.get(i);
            }
        }
        double Grades = (double) SumArray/(intArray.size());
        System.out.println("The average of Numbers entered is "+ Grades);
    }
}
