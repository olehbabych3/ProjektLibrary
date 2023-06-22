package app;

import model.Book;
import model.Library;

/**
 * Aplikacja testująca funkcjonalność biblioteki.
 */
public class LibraryApp {
    public static void main(String[] args) {
        // Tworzenie biblioteki
        Library library = new Library();

        // Dodawanie książek
        Book book1 = new Book("Wiedźmin", "Andrzej Sapkowski");
        Book book2 = new Book("Harry Potter", "J.K. Rowling");
        library.addBook(book1);
        library.addBook(book2);

        // Wyświetlanie książek w bibliotece
        System.out.println("Książki w bibliotece:");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }

        // Usuwanie książki
        library.removeBook(book1);

        // Wyświetlanie książek po usunięciu
        System.out.println("Książki po usunięciu:");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
}
