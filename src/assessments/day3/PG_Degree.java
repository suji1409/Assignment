package assessments.day3;

public class PG_Degree extends Degree{

    public void getDegree(){
        System.out.println("Im an PostGraduate");
    }

    public static void main(String[] args) {
        Degree dg = new Degree(); dg.getDegree();
        UG_Degree ug = new UG_Degree(); ug.getDegree();
        PG_Degree pg = new PG_Degree(); pg.getDegree();
    }
}
