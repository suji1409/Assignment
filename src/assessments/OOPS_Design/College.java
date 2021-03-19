package assessments.OOPS_Design;

import java.util.List;

public class College {

    public static void main(String[] args) {


        int NoOfBooksCollege;
        int NoOfStaffsCollege;
        int NoOfBooksRented;

        ArtsDepartment Arts = new ArtsDepartment();
        Library ArtsLibrary = Arts.setLibrary();

        EnggDepartment Engg = new EnggDepartment();
        Library LibraryEngg = Engg.setLibrary();

        NoOfBooksCollege = ArtsLibrary.getNoOfBooksInLibrary()+ LibraryEngg.getNoOfBooksInLibrary();
        NoOfStaffsCollege = ArtsLibrary.getNoOfStaffInLibrary() + LibraryEngg.getNoOfStaffInLibrary();
        NoOfBooksRented = ArtsLibrary.getNoOfBooksRented() + LibraryEngg.getNoOfBooksRented();
        int NoOfFurniture = ArtsLibrary.getNoOfChairs()+LibraryEngg.getNoOfChairs();

        System.out.println("Total number of books in Library = "+ NoOfBooksCollege);
        System.out.println("Total number of Staffs in College = "+ NoOfStaffsCollege);
        System.out.println("Total number of books rented = "+ Books.NoOfBooksRented);
        System.out.println("Total number of chairs = "+Furniture.NoOfChairs);

        Staff ArtsEldestStaff = Arts.getEldestStaffDetails(Arts.staffArrayList);

        Staff EnggEldestStaff = Engg.getEldestStaffDetails(Engg.staffArrayList);

        if(ArtsEldestStaff.getStaffAge()> EnggEldestStaff.getStaffAge()) {
            System.out.println("Eldest Staff in College is from Arts Department and the details are " + ArtsEldestStaff.getStaffFirstName() + ArtsEldestStaff.getStaffLastName() + ArtsEldestStaff.getStaffAge());
        }
            else{
            System.out.println("Eldest Staff in College is from Engineering Department and the details are "+ EnggEldestStaff.getStaffFirstName() + EnggEldestStaff.getStaffLastName() + EnggEldestStaff.getStaffAge());

        }

    }





}
