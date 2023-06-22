package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Reprezentuje bibliotekę, która przechowuje książki.
 */
public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
