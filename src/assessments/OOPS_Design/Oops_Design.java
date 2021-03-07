package assessments.OOPS_Design;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Oops_Design {
    public static void main(String[] args) {



/*

       lib.setAllbooks(books);
       lib.setFurn(furn);
       lib.setStaff(staff);

        System.out.println(lib.getAllbooks().isBookRented());*/
       // System.out.println(libs.get(0).getAllbooks().Author);





}
@Test
    public void returnNoOfEngBooks() {
        Books books = new Books();
        books.Author ="Shakespeare";
        books.ISBN ="1222";
        books.isBookRented= true;
    List<Books> bookslist = new ArrayList<>();
    bookslist.add(books);
        Furniture furn = new Furniture();
        furn.furniture_material = "wood";
        furn.furniture_type = "chair";
        Staff staff = new Staff();
        staff.staff_age=34;
        staff.fName="sujitha";
        staff.lName="sundar";
        College college = new College();
        Library lib = new Library(bookslist,furn,staff);
        Engg engg = new Engg();
        engg.setLab("lans of labs");

        System.out.println(bookslist.size());

    }


}
