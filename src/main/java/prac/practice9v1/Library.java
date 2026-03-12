package prac.practice9v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();

    public Library() {}

    public Library(String name) { this.name = name; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Book> getBooks() { return books; }
    public List<Reader> getReaders() { return readers; }

    public void addBook(Book book) { books.add(book); }
    public void registerReader(Reader reader) { readers.add(reader); }

    @Override
    public String toString() {
        return "Library{" + "name='" + name + '\'' +
                ", books=" + books + ", readers=" + readers + '}';
    }
}