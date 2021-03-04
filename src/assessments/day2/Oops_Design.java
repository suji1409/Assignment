package assessments.day2;

import java.util.ArrayList;
import java.util.List;

public class Oops_Design {
    public static void main(String[] args) {
        College college = new College();
        Library lib = new Library();
        Books books = new Books();
        books.Author ="Shakespeare";
        books.ISBN ="1222";
        books.isBookRented= true;
        Furniture furn = new Furniture();
        furn.furniture_material = "wood";
        furn.furniture_type = "chair";
        Staff staff = new Staff();
        staff.staff_age=34;
        staff.fName="sujitha";
        staff.lName="sundar";
       lib.setAllbooks(books);
       lib.setFurn(furn);
       lib.setStaff(staff);

        System.out.println(lib.getAllbooks().isBookRented());
       // System.out.println(libs.get(0).getAllbooks().Author);




    }
}
