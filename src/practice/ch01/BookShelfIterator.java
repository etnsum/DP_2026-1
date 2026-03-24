package practice.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index; // 현재 위치

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() { //책꽂이에서 꺼내올 다음 책이 있는지 확인하는 메소드
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() { //책꽂이에서 다음 책을 꺼내오는 메소드
        if (!hasNext()) {
            throw new NoSuchElementException(); // 더 이상 꺼내올 책이 없을 때 예외 처리
        }
        Book book = bookShelf.getBookAt(index); // 현재 위치의 책을 가져옴
        index++;
        return book;
    }
}
