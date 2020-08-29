/*  Created by IntelliJ IDEA.
 *  User: Harshit Raghav (HarshitRaghav55)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String ISBNNumber;

    public Book() {
        authorName = "Author1";
        bookName = "Book1";
        ISBNNumber = "100000054754";
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public Book(String authorName, String bookName, String ISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumber = ISBNNumber;
    }

    public Book(String bookName, String ISBNNumber) {
        this.bookName = bookName;
        this.ISBNNumber = ISBNNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getISBNNumber(), book.getISBNNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getISBNNumber());
    }

    @Override
    public String toString() {
        return "Book Name : " + bookName +
                ", Author Name :" + authorName +
                ", ISBN Number : " + ISBNNumber;
    }

    public void addBook(Book book) {
        this.setBookName(book.getBookName());
        this.setAuthorName(book.getAuthorName());
        this.setISBNNumber(book.getISBNNumber());
    }
}
