package BookList;

import Book.Book;
import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> bookList;

    public BookList() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public Book searchByTitle(String title) {
        for (Book book : bookList) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book searchByAuthor(String author) {
        for (Book book : bookList) {
            if (book.getBookAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    public Book searchByYear(int year) {
        for (Book book : bookList) {
            if (book.getYearPublished() == year) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for (Book book : bookList) {
            book.TampilkanInfo();
            System.out.println("--------------------");
        }
    }
}
