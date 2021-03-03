package assessments.day2;

import java.util.Scanner;

public class GradesAggregate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int grade1, grade2, grade3, grade4;
        grade1 = sc.nextInt();
        grade2 = sc.nextInt();
        grade3 = sc.nextInt();
        grade4 = sc.nextInt();
        int grade_sum = grade1 + grade2 + grade3 + grade4;
        double grade_avg = grade_sum / 4;
        System.out.println(grade_avg);
        System.out.println(Math.max(Math.max(grade1, grade2), Math.max(grade3, grade4)));
        System.out.println(Math.min(Math.min(grade1, grade2), Math.min(grade3, grade4)));

        int[] grades = {grade1,grade2,grade3,grade4};
        int temp;
        for (int i = 0; i < grades.length; i++)
        {
            for (int j = i + 1; j < grades.length; j++)
            {
                if (grades[i] < grades[j])
                {
                    temp = grades[i];
                    grades[i] = grades[j];
                    grades[j] = temp;
                }
            }
        }
        int Highest =  grades[grades.length-1];
        System.out.println(Highest);
    }

}

