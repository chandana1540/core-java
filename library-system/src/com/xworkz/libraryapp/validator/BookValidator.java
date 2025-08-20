package com.xworkz.libraryapp.validator;

import com.xworkz.libraryapp.book.Book;

public class BookValidator {
    public boolean bookValidated(Book book){
        boolean isBookValidated = false;
        boolean bookNameValid = false;
        boolean bookIdValid = false;
        boolean bookBrandValid = false;
        boolean bookPriceValid = false;
        if(book.getBookName()!=null && !book.getBookName().isEmpty()){
            bookNameValid = true;
        }
        else{
            System.out.println("bookName is not valid");
        }
        if(book.getBookId()!=null && !book.getBookId().isEmpty()){
            bookIdValid = true;
        }
        else{
            System.out.println("bookId is not valid");
        }
        if(book.getBrand()!=null && !book.getBrand().isEmpty()){
            bookBrandValid = true;
        }
        else{
            System.out.println("bookbrand is not valid");
        }
        if(book.getPrice()!=0){
            bookPriceValid = true;
        }
        else{
            System.out.println("bookprice is not valid");
        }
        if(bookNameValid && bookIdValid && bookBrandValid && bookPriceValid){
            isBookValidated = true;
        }
        return isBookValidated;
    }
}
