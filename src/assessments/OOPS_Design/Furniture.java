package assessments.OOPS_Design;

public class Furniture {

    String Type;
    String Material;
    public static int NoOfChairs=0;
    public Furniture(String Type,String Material)
    {
        this.Type=Type;
        this.Material=Material;

        if(Type.equalsIgnoreCase("chair")) {
            NoOfChairs++;
        }
    }
    public int getNOOfChairs()
    {
        return NoOfChairs;
    }
}
