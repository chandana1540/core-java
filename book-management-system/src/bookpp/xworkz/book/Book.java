package bookpp.xworkz.book;

public class Book {
    String bookName;
    int bookId;
    double bookPrice;
    String bookAuthor;

    Book(String bookName, int bookId, double bookPrice, String bookAuthor ){
        this.bookName = bookName;
        this.bookId = bookId;
        this.bookPrice = bookPrice;
        this.bookAuthor = bookAuthor;
    }
    public void getBookDetails(){
        System.out.println("bookName: "+bookName);
        System.out.println("bookId: "+bookId);
        System.out.println("bookPrice: "+bookPrice);
        System.out.println("bookAuthor: "+bookAuthor);

    }

}
