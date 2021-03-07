package assessments.Array_Assignment;

public class ArrayRandomCar {
    public static void main(String[] args) {

        int value = (int)(Math.random() * ((10000 - 1000) + 1)) + 1000;
        String CarNo = "MH"+value;
        System.out.println(CarNo);

    }

}
