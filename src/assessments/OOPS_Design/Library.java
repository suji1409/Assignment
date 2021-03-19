package assessments.OOPS_Design;

import java.util.List;

public class Library {

    private final List<Books> books;
    private final List<Furniture> furniture;
    private final List<Staff> staff;

    public int getBooksCount(){
        return books.size();
    }


    public Library(List<Books> books, List<Staff> staff, List<Furniture> furniture) {
        this.books = books;
        this.staff = staff;
        this.furniture = furniture;
    }


    public List<Books> getAllBooksInLibrary() {
        return books;
    }

    public List<Staff> getAllStaffsInLibrary() {
        return staff;
    }

    public List<Furniture> getAllFurnitureInLibrary() {
        return furniture;
    }

    public int getNoOfBooksInLibrary()
    {
        return books.size();
    }
    public int getNoOfStaffInLibrary()
    {
        return staff.size();
    }
    public int getNoOfChairs(){
        return Furniture.NoOfChairs;
    }

    public int getNoOfBooksRented(){
        return Books.NoOfBooksRented;
    }
}
