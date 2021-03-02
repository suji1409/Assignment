package training;

public class Book {

    String name;
    String isbn_code;
    int pages;
    String author;
    public static int NoOfBooks=0;

    public Book(){
    }

    public Book(String name,String isbn_code,int pages,String author){
        this.author = author;
        this.name=name;
        this.isbn_code=isbn_code;
        this.pages=pages;
        NoOfBooks++;
    }

    public int MaintainBookCount(){
        return NoOfBooks;

    }
}
