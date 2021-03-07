package assessments.OOPS_Design;

import java.util.List;

public class Library {
List<Books> allbooks;
Furniture furn;
Staff staff;

    public Library(List<Books> allbooks, Furniture furn, Staff staff) {
        this.allbooks =  allbooks;
        this.furn = furn;
        this.staff = staff;
    }

    public Library() {
    }

    public List<Books> getAllbooks() {
        return allbooks;
    }

    public void setAllbooks(Books allbooks) {
        this.allbooks = (List<Books>) allbooks;
    }

    public Furniture getFurn() {
        return furn;
    }

    public void setFurn(Furniture furn) {
        this.furn = furn;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}

class Books{
    public String ISBN;
    public boolean isBookRented;
    public String Author;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isBookRented() {
        return isBookRented;
    }

    public void setBookRented(boolean bookRented) {
        isBookRented = bookRented;

    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}

class Furniture{
    public String furniture_type;
    public String furniture_material;

    public String getFurniture_type() {
        return furniture_type;
    }

    public void setFurniture_type(String furniture_type) {
        this.furniture_type = furniture_type;
    }

    public String getFurniture_material() {
        return furniture_material;
    }

    public void setFurniture_material(String furniture_material) {
        this.furniture_material = furniture_material;
    }
}

class Staff{
    public int staff_age;
    public String fName;
    public String lName;

    public int getStaff_age() {
        return staff_age;
    }

    public void setStaff_age(int staff_age) {
        this.staff_age = staff_age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}