
import java.util.ArrayList;

class Book {
    String name;
    String ISBN;
    String[] author;
    static int bookNo = 0;

    public Book(String name, String ISBN, String[] author) {
        this.name = name;
        this.ISBN = ISBN;
        this.author = new String[author.length];
        for (int i = 0; i < author.length; i++) {
            this.author[i] = author[i];
        }
        bookNo++;
    }

}

public class Library {
    ArrayList<Book> books;
    public Library() {
        books = new ArrayList<> ();
    }
    public void addBook (Book book) {
        this.books.add(book);
    }
}

class LibraryTest {
    public static void main(String[] args) {
        String[] author = {"Kathy Sierra", "Bert Bates"};
        Book javaBook = new Book ("Head first Java", "978-0596009205", author);
        System.out.println(Book.bookNo);
        javaBook = new Book("Java programming", "582375927948", author);
        System.out.println(Book.bookNo);
    }
}