package ch5.ex1;

public class Book {
    private String bookCategory;
    private String author;
    private String title;
    private String publisher;
    private double price;
    private int quantity;

    public Book(String bookCategory, String author, String title, String publisher, double price, int quantity) {
        this.bookCategory = bookCategory;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
