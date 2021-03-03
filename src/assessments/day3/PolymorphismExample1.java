package assessments.day3;

public class PolymorphismExample1 {
    private static void println(int Num){
        System.out.println("Printing Numbers "+Num);
    }
    private static void println(String str){
        System.out.println("Printing String "+str);
    }
    private static void println(double dbl){
        System.out.println("Printing Double dataType "+dbl);
    }

    private static void println(float flt){
        System.out.println("Printing Float Datatype "+flt);
    }
    private static void println(long lng){
        System.out.println("Printing Long Datatype "+lng);
    }
    private static void println(boolean bool){
        System.out.println("Printing boolean Datatype "+bool);
    }
    private static void println(Character c){
        System.out.println("Printing Char Datatype "+c);
    }
    public static void main(String[] args) {
        int a = 7; String s = "abc";
        double db = 4.897;
        float f = 5.67f;
        Character d = 't';
        boolean bln = true;
        println(d);

    }
}
