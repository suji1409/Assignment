package training;

public class Application {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Alchemist","IND-002_PC_2010",56,"Paulo Coelho");
        System.out.println(book2.author + book2.pages + book2.name + book2.isbn_code);
        System.out.println(book2.MaintainBookCount());
        Book book3 = new Book("life of pi","IN?d-09-hjb",78,"JM");
        System.out.println(book3.author + book3.pages + book3.name + book3.isbn_code);
        System.out.println(book3.MaintainBookCount());
    }
}
