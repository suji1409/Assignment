package assessments.Level1.ConditionalStatement;

public class CheckRectSquare {
    public static void main(String[] args) {
        int len = 5;
        int bdth =5;
        int are = len*bdth;
        System.out.println(Math.sqrt(are));
        double sqrtval = Math.sqrt(are);
        if((sqrtval - Math.floor(sqrtval)) == 0){
            System.out.println("The area of rectangle is Square");
        }
        else
        {
            System.out.println("The area of rectangle is NOT Square");
        }
    }
}
