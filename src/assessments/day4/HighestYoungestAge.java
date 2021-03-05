package assessments.day4;

import java.util.Scanner;

public class HighestYoungestAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ageArray  = new int[3];
        for(int i =0;i<3;i++){
            ageArray[i] =sc.nextInt();
        }
        int temp;
        for (int i = 0; i < ageArray.length; i++)
        {
            for (int j = i + 1; j < ageArray.length; j++)
            {
                if (ageArray[i] > ageArray[j])
                {
                    temp = ageArray[i];
                    ageArray[i] = ageArray[j];
                    ageArray[j] = temp;
                }
            }
        }
        System.out.println("Smallest of 3 age is "+ ageArray[ageArray.length-ageArray.length]);
        System.out.println("Highest of 3 age is "+ ageArray[ageArray.length-1]);

    }

}

