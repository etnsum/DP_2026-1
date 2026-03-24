package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.Comparator;

public class BookShelfYearIterator implements Iterator<Book> {
    private Book[] books;
    private int index;

    public BookShelfYearIterator(BookShelf bookShelf) {
        books = new Book[bookShelf.getLength()];

        for (int i = 0; i < bookShelf.getLength(); i++) {
            books[i] = bookShelf.getBookAt(i);
        }

        Arrays.sort(books, Comparator.comparingInt(Book::getYear).reversed());

        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < books.length;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return books[index++];
    }
}