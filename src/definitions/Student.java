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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBooks() == student.getNumberOfBooks() &&
                Objects.equals(firstNameOfStudent, student.firstNameOfStudent) &&
                Objects.equals(secondNameOfStudent, student.secondNameOfStudent) &&
                Objects.equals(thirdNameOfStudent, student.thirdNameOfStudent) &&
                Arrays.equals(getBooks(), student.getBooks());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstNameOfStudent, secondNameOfStudent, thirdNameOfStudent, getUniversityRollNumber(), getNumberOfBooks());
        result = 31 * result + Arrays.hashCode(getBooks());
        return result;
    }

    @Override
    public String toString() {
        return "Student : \n" +
                "Name of student : " + firstNameOfStudent + secondNameOfStudent +
                thirdNameOfStudent +
                "\n UniversityRollNumber :" + universityRollNumber +
                "\n numberOfBooks : " + numberOfBooks +
                "\n books : " + Arrays.toString(books) +
                '}';
    }
}
