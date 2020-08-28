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

    public String getNameOfStudent() {
        return firstNameOfStudent + middleNameOfStudent + lastNameOfStudent;
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

    public void setNameOfStudent(String firstNameOfStudent, String secondNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
        this.middleNameOfStudent = secondNameOfStudent;
        nameOfStudent = this.firstNameOfStudent + this.middleNameOfStudent;
    }

    public void setNameOfStudent(String firstNameOfStudent, String secondNameOfStudent,
                                 String thirdNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
        this.middleNameOfStudent = secondNameOfStudent;
        this.lastNameOfStudent = thirdNameOfStudent;
        nameOfStudent = this.firstNameOfStudent + this.middleNameOfStudent
                + this.lastNameOfStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
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
        return "Student{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", firstNameOfStudent='" + firstNameOfStudent + '\'' +
                ", middleNameOfStudent='" + middleNameOfStudent + '\'' +
                ", lastNameOfStudent='" + lastNameOfStudent + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooks=" + numberOfBooks +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
