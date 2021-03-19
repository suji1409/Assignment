package assessments.OOPS_Design;

import java.util.ArrayList;
import java.util.List;

public class EnggDepartment implements Department{

    public List<Staff> staffArrayList;
    public  List<Books> booksArrayList;
    public List<Furniture> furnitureArrayList;

    @Override
    public Library setLibrary() {

        Books b1 = new Books("Engineering Graphics","7567","true","Fuder");
        Books b2 = new Books("Maths1","35245","true","Noha");

        booksArrayList = new ArrayList<Books>();
        booksArrayList.add(b1);
        booksArrayList.add(b2);

        Furniture f1=new Furniture("racks","iron");
        Furniture f2=new Furniture("CHAIR","wood");
        Furniture f3=new Furniture("Chair","iron");
        Furniture f4=new Furniture("chair","wood");

        furnitureArrayList = new ArrayList<Furniture>();
        furnitureArrayList.add(f1);
        furnitureArrayList.add(f2);
        furnitureArrayList.add(f3);

        Staff s1= new Staff(29,"Spandana","Nannapaneni");
        Staff s2= new Staff(30,"Dileep","Bellamkonda");
        Staff s3= new Staff(31,"Sonal","S");
        Staff s4= new Staff(32,"Gayathri","M");
        Staff s5= new Staff(59,"Teena","Mathew");

        staffArrayList = new ArrayList<Staff>();
        staffArrayList.add(s1);
        staffArrayList.add(s2);
        staffArrayList.add(s3);
        staffArrayList.add(s4);
        staffArrayList.add(s5);

        Library library = new Library(booksArrayList,staffArrayList,furnitureArrayList);
        return library;
    }

    @Override
    public void setMusicRoom() {
        System.out.println("Engineering Department will not have Music Room");
    }

    @Override
    public void setLabRoom() {
        System.out.println("Lab is set for Engineering Department Successfully");
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
