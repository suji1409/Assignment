package assessments.Polymorphism_Inheritance;

public class PolymorphismExample2 {
    public static int area(int length, int breadth){
       return length*breadth;
    }

    public static int area(int side){
        return side*side;
    }
    public static void main(String[] args) {
        int area_square = area(6);
        System.out.println("Area of Square is "+ area_square);

        int area_rect = area(5,6);
        System.out.println("Area of Rectangle is "+ area_rect);

    }
}
