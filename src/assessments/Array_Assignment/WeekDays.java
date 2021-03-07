package assessments.Array_Assignment;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1 -> System.out.println("User input is 1 and the weekday is " + week[input - 1]);
            case 2 -> System.out.println("User input is 2 and the weekday is " + week[input - 1]);
            case 3 -> System.out.println("User input is 3 and the weekday is " + week[input - 1]);
            case 4 -> System.out.println("User input is 4 and the weekday is " + week[input - 1]);
            case 5 -> System.out.println("User input is 5 and the weekday is " + week[input - 1]);
            case 6 -> System.out.println("User input is 6 and the weekday is " + week[input - 1]);
            case 7 -> System.out.println("User input is 7 and the weekday is " + week[input - 1]);
            default -> throw new IllegalStateException("Unexpected value: " + input);
        }

    }
}
