package com.xworkz.libraryapp.book;

public class Book {
    private String bookName;
    private String bookId;
    private String brand;
    private double price;

    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public String getBookName(){
        return bookName;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
