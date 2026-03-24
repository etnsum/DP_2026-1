package practice.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        Book book = new Book("Java Programming");
        System.out.println("Book name: " + book.getName());

        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("Java Programming"));
        bookShelf.appendBook(new Book("Android Programming"));
        bookShelf.appendBook(new Book("C Programming"));


        // 방법1: 클라이언트가 직접 책장에 접근하여 책을 가져오는 방법
        for (int i = 0; i < bookShelf.getLength(); i++) {
            System.out.println("Book " + ( i + 1) + ": " + bookShelf.getBookAt(i).getName());
        }

        // 방법2: iterator를 이용하여 책을 가져오는 방법
        // Iterator를 얻어옴
        Iterator<Book> it = bookShelf.iterator();
        while(it.hasNext()) { // 다음 책이 있는지 확인
            System.out.println("Book: " + it.next().getName()); // 다음 책을 가져옴
        }

        // 확장 for문을 이용하여 책을 가져오는 방법
        // 이게 가능한 이유는 BookShelf가 Iterable 인터페이스를 구현했기 때문
        for (Book b : bookShelf) { // 형식: for (타입 변수명 : 컬렉션) { ... }
            System.out.println("Book: " + b.getName());
        }
    }
}