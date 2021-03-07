package assessments.day4.Loops;

public class Generate_Prime {
    public static void main(String[] args) {
        boolean flag;
        int input;
        for (input = 1; input <= 3; input++) {
            flag = false;
            for (int i = 2; i < input; i++) {
                // condition for nonprime number
                if (input % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(input + " is a prime number.");
            else
                System.out.println(input + " is not a prime number.");
        }
    }
}
