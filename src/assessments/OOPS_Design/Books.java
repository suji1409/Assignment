package assessments.OOPS_Design;

public class Books {

    String Name;
    String ISBN;
    String BlnBookRented;
    String Author;
    public static int NoOfBooksRented=0;

    public Books(String Name,String ISBN,String BlnBookRented,String Author)
    {
        this.Name=Name;
        this.ISBN=ISBN;
        this.BlnBookRented=BlnBookRented;
        this.Author=Author;
        if(BlnBookRented.equalsIgnoreCase("true"))
            NoOfBooksRented++;
    }

    public String getName() {
        return Name;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getIsBookRented() {
        return BlnBookRented;
    }

    public String getAuthor() {
        return Author;
    }

    public int countOfBooksRented()
    {
        return NoOfBooksRented;
    }


}
