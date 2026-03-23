package hw.ch01;

public class Book {
    private String name;

    // 장르, 출판연도, 가격 필드 추가
    private String genre;   
    private int year;       
    private double price;   

    public Book(String name) {
        this.name = name;
    }

    // 생성자 추가
    public Book(String name, String genre, int year, double price) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    // getter 추가
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