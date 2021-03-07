package assessments.Polymorphism_Inheritance;

public class PolymorphismExample1 {
    Object obj1;
/*
    private static void println(int Num){
        System.out.println("Printing Numbers "+Num);
    }

    private static void println_local(String str){
        System.out.println("Printing String "+str);
    }

    private static void println_local(double dbl){
        System.out.println("Printing Double dataType "+dbl);
    }

    private static void println_local(float flt){
        System.out.println("Printing Float Datatype "+flt);
    }

    private static void println_local(long lng){
        System.out.println("Printing Long Datatype "+lng);
    }
    private static void println_local(boolean bool){
        System.out.println("Printing boolean Datatype "+bool);
    }

    private static void println_local(Character c){
        System.out.println("Printing Char Datatype "+c);
    }
*/

    public void println_local(Object obj){

        this.obj1 = obj;

        System.out.println("Printing DataTypes "+ obj1);
    }
    public static void main(String[] args) {
        int a = 7; String s = "abc";
        double db = 4.897;
        float f = 5.67f;
        Character d = 't';
        boolean bln = true;
        PolymorphismExample1 pex1 = new PolymorphismExample1();
        pex1.println_local('o');

    }
}
