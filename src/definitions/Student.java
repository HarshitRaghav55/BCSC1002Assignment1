/*  Created by IntelliJ IDEA.
 *  User: Harshit Raghav (HarshitRaghav55)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String nameOfStudent;
    private String firstNameOfStudent;
    private String middleNameOfStudent;
    private String lastNameOfStudent;
    private long universityRollNumber;
    private int numberOfBooks;
    private Book[] books;

    public Student() {
        nameOfStudent = "Harshit Raghav";
        universityRollNumber = 191500329l;
        numberOfBooks = 2;
        books = new Book[2];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book("Author" + (i + 1), "Book" + (i + 1),
                    "98675432122" + (i + 5));
        }
    }

    public Student(String nameOfStudent, long universityRollNumber, int numberOfBooks) {
        this.nameOfStudent = nameOfStudent;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooks = numberOfBooks;
        this.numberOfBooks = 2;
        books = new Book[2];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book("Author" + (i + 1), "Book" + (i + 1),
                    "98675432122" + (i + 5));
        }
    }

    public Student(String nameOfStudent, long universityRollNumber,
                   int numberOfBooks, Book[] books) {
        this.nameOfStudent = nameOfStudent;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooks = numberOfBooks;
        this.numberOfBooks = 2;
        this.books = books;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String firstNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
        nameOfStudent = this.firstNameOfStudent;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public Book[] getBooks() {
        return books.clone();
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void setNameOfStudent(String firstNameOfStudent, String lastNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
        this.lastNameOfStudent = lastNameOfStudent;
        nameOfStudent = this.firstNameOfStudent + this.lastNameOfStudent;
    }

    public void setNameOfStudent(String firstNameOfStudent, String middleNameOfStudent,
                                 String lastNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
        this.middleNameOfStudent = middleNameOfStudent;
        this.lastNameOfStudent = lastNameOfStudent;
        nameOfStudent = this.firstNameOfStudent + this.middleNameOfStudent
                + this.lastNameOfStudent;
    }

    public void getNameOfBooks() {
        for (Book book : books) {
            System.out.println(book.getBookName());
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBooks() == student.getNumberOfBooks() &&
                Objects.equals(getNameOfStudent(), student.getNameOfStudent()) &&
                Objects.equals(firstNameOfStudent, student.firstNameOfStudent) &&
                Objects.equals(middleNameOfStudent, student.middleNameOfStudent) &&
                Objects.equals(lastNameOfStudent, student.lastNameOfStudent) &&
                Arrays.equals(getBooks(), student.getBooks());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNameOfStudent(), firstNameOfStudent, middleNameOfStudent, lastNameOfStudent, getUniversityRollNumber(), getNumberOfBooks());
        result = 31 * result + Arrays.hashCode(getBooks());
        return result;
    }

    @Override
    public String toString() {
        return "Student : " +
                "Name of Student : " + nameOfStudent +
                "  University Roll Number : " + universityRollNumber +
                "  NumberOfBooks=" + numberOfBooks +
                " \n Books" + Arrays.toString(books);
    }
}
