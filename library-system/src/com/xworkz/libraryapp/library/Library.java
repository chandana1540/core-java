package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.validator.BookValidator;

public class Library {
    Book book;
    public boolean addBook(Book book){
        boolean isBookAdded = false;
        BookValidator bookValidator = new BookValidator();
        boolean isBookInfoValid = bookValidator.bookValidated(book);
        if(isBookInfoValid){
            this.book = book;
            isBookAdded = true;
        }
        return isBookAdded;


    }
    public void getBookInfo(){
        System.out.println("bookName: "+book.getBookName());
        System.out.println("bookid: "+book.getBookId());
        System.out.println("brand: "+book.getBrand());
        System.out.println("bookPrice: "+book.getPrice());


    }
    public boolean updateProductPrice(double price){
        boolean isPriceUpdated = false;
        if( price>0 ) {
         book.setPrice(price);
         isPriceUpdated = true;

        }
        return isPriceUpdated;
    }
}
