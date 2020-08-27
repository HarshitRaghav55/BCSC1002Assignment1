/*  Created by IntelliJ IDEA.
 *  User: Harshit Raghav (HarshitRaghav55)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String firstNameOfStudent;
    private String secondNameOfStudent;
    private String thirdNameOfStudent;
    private long universityRollNumber;
    private int numberOfBooks;
    private Book[] books;

    public String getNameOfStudent() {
        return firstNameOfStudent + secondNameOfStudent + thirdNameOfStudent;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public Book[] getBooks() {
        return books.clone();
    }

    public void setNameOfStudent(String firstNameOfStudent, String secondNameOfStudent,
                                 String thirdNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
        this.secondNameOfStudent = secondNameOfStudent;
        this.thirdNameOfStudent = thirdNameOfStudent;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
