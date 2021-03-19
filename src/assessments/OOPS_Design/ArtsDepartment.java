package assessments.OOPS_Design;

import java.util.ArrayList;
import java.util.List;

public class ArtsDepartment implements Department {

    public List<Staff> staffArrayList;
    public  List<Books> booksArrayList;
    public List<Furniture> furnitureArrayList;

    @Override
    public Library setLibrary() {
        Books b1 = new Books("Thermodynamics","7567","true","Fuder");
        Books b2 = new Books("Graphics","35245","false","Noha");

       booksArrayList = new ArrayList<Books>();
        booksArrayList.add(b1);
        booksArrayList.add(b2);


        Furniture f1=new Furniture("racks","iron");
        Furniture f2=new Furniture("tables","wood");
        Furniture f3=new Furniture("tables","iron");
        Furniture f4=new Furniture("chair","wood");

        furnitureArrayList = new ArrayList<Furniture>();
        furnitureArrayList.add(f1);
        furnitureArrayList.add(f2);
        furnitureArrayList.add(f3);

        Staff s1= new Staff(53,"Nisha","Mathew");
        Staff s2= new Staff(49,"Abraham","Thomas");
        staffArrayList = new ArrayList<Staff>();
        staffArrayList.add(s1);
        staffArrayList.add(s2);

        Library library = new Library(booksArrayList,staffArrayList,furnitureArrayList);
        return library;
    }

    @Override
    public void setMusicRoom() {
        System.out.println("Music Room is set for Arts Department");
    }

    @Override
    public void setLabRoom() {
        System.out.println("Arts Department will not have Lab Room");
    }


    @Override
    public Staff getEldestStaffDetails(List<Staff> staff) {
        int i;
        for(i=0;i<staff.size()-1;i++)
        {
            if(staff.get(i).getStaffAge()==Staff.MaxAge)
                break;

        }
        return staff.get(i);
    }

}
