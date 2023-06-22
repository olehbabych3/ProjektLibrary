package model;

/**
 * Reprezentuje książkę w bibliotece.
 */
public class Book {
    private String title;
    private String author;

    /**
     * Tworzy nową książkę o określonym tytule i autorze.
     *
     * @param title  tytuł książki
     * @param author autor książki
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Zwraca tytuł książki.
     *
     * @return tytuł książki
     */
    public String getTitle() {
        return title;
    }

    /**
     * Zwraca autora książki.
     *
     * @return autor książki
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Zwraca reprezentację tekstową książki w formacie:
     * "Book{title='Tytuł', author='Autor'}".
     *
     * @return reprezentacja tekstowa książki
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
