package ch01.Sample;

public class Book {
    private String name;

    // 추가 필드
    private String genre;   // 장르
    private int year;       // 출판연도
    private double price;   // 가격

    // ✅ 기존 생성자 유지 (절대 삭제하면 안됨)
    public Book(String name) {
        this.name = name;
    }

    // ✅ 새로운 생성자 (오버로딩)
    public Book(String name, String genre, int year, double price) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    // 기존 getter
    public String getName() {
        return name;
    }

    // 추가 getter들
    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}