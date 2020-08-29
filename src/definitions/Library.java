/*  Created by IntelliJ IDEA.
 *  User: Harshit Raghav (HarshitRaghav55)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private final int MAX_BOOKS = 100;
    private final Book[] booksCurrentlyAvailable = new Book[MAX_BOOKS];
    private final int numberOfBooks;

    public Library() {
        booksCurrentlyAvailable[0] = new Book();
        booksCurrentlyAvailable[0].setBookName("The Life and Times of the Nawabs of Lucknow");
        booksCurrentlyAvailable[0].setAuthorName("Ravi Bhatta");
        booksCurrentlyAvailable[0].setISBNNumber("4351271492354");
        booksCurrentlyAvailable[1] = new Book();
        booksCurrentlyAvailable[1].setBookName("Five the Treasure Island");
        booksCurrentlyAvailable[1].setAuthorName("Enid Blyton");
        booksCurrentlyAvailable[1].setISBNNumber("0340889454754");
        booksCurrentlyAvailable[2] = new Book();
        booksCurrentlyAvailable[2].setBookName("Half Girlfriend");
        booksCurrentlyAvailable[2].setAuthorName("Chetan Bhagat");
        booksCurrentlyAvailable[2].setISBNNumber("2352352352534");
        booksCurrentlyAvailable[3] = new Book();
        booksCurrentlyAvailable[3].setBookName("A Brief History of Time");
        booksCurrentlyAvailable[3].setAuthorName("Stephen Hawking");
        booksCurrentlyAvailable[3].setISBNNumber("2345454532345");
        numberOfBooks = 4;
    }

    public Library(int numberOfBooks, Book[] books) {
        this.numberOfBooks = numberOfBooks;
        for (int i = 0; i < numberOfBooks; i++) {
            this.booksCurrentlyAvailable[i] = new Book();
            this.booksCurrentlyAvailable[i] = books[i];
        }
    }

    public Book[] getBooksCurrentlyAvailable() {
        return booksCurrentlyAvailable.clone();
    }

    public void setBooksCurrentlyAvailable(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            this.booksCurrentlyAvailable[i] = new Book();
            this.booksCurrentlyAvailable[i] = books[i];
        }
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksCurrentlyAvailable(), library.getBooksCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksCurrentlyAvailable());
    }

    @Override
    public String toString() {
        return "Library : " +
                "Books Currently Available : " + Arrays.toString(booksCurrentlyAvailable);
    }

    public void displayBooksCurrentlyAvailable() {
        for (int i = 0; i < this.numberOfBooks; i++) {
            System.out.println("Book " + (i + 1) + " : ");
            System.out.println(booksCurrentlyAvailable[i]);
        }
    }

    public void checkoutBook(Book checkedOutBook) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (booksCurrentlyAvailable[i].equals(checkedOutBook)) {
                booksCurrentlyAvailable[i].setBookName("Not availabe");
                booksCurrentlyAvailable[i].setAuthorName("Author");
                booksCurrentlyAvailable[i].setISBNNumber("100000000000");
                break;
            }
        }
    }
}
