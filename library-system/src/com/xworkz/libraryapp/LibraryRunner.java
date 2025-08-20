package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.library.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("Belive");
        book.setBookId("se12");
        book.setBrand("chandras");
        book.setPrice(210.00);
        Library library = new Library();
        boolean created = library.addBook(book);
        System.out.println("the book info is created :"+created);
        if(created){
            library.getBookInfo();


        }
        library.updateProductPrice(230.90);
        library.getBookInfo();

    }
}
