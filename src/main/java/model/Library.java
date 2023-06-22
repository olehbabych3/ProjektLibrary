package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Reprezentuje bibliotekę, która przechowuje książki.
 */
public class Library {
    private List<Book> books;

    /**
     * Tworzy nową bibliotekę.
     */
    public Library() {
        books = new ArrayList<>();
    }

    /**
     * Dodaje książkę do biblioteki.
     *
     * @param book książka do dodania
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Usuwa książkę z biblioteki.
     *
     * @param book książka do usunięcia
     */
    public void removeBook(Book book) {
        books.remove(book);
    }

    /**
     * Zwraca listę książek w bibliotece.
     *
     * @return lista książek w bibliotece
     */
    public List<Book> getBooks() {
        return books;
    }
}
