package assessments.Polymorphism_Inheritance;

public class InheritanceAssignment extends Laptop{


    public InheritanceAssignment(String name, int price, String processor, int ram, int hdd) {
        super(name, price, processor, ram, hdd);
    }

    public static void main(String[] args) {

        Laptop ia = new Laptop("Lenovo",1000,"i3",2,3);
        System.out.println("Name : "+ia.name+"\n"+"Price : $"+ia.price +"\n"+ "Processor : "+ia.processor +"\n"+"RAM : "+ia.ram+"GB"+"\n"+"HDD : "+ia.hdd+"GB");

        System.out.println( "*************************************");
        Laptop ia1 = new Laptop("Sony",2000,"i7",4,1);
        System.out.println("Name : "+ia1.name+"\n"+"Price : $"+ia1.price +"\n"+ "Processor : "+ia1.processor +"\n"+"RAM : "+ia1.ram+"GB"+"\n"+"HDD : "+ia1.hdd+"TB");


        System.out.println( "*************************************");
    }
}
