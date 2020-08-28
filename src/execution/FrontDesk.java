/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Enter your Details Student :");
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Name of the student : ");
        student.setNameOfStudent(scannerObject.nextLine());
        System.out.print("University roll number of the student : ");
        student.setUniversityRollNumber(scannerObject.nextLong());
        System.out.print("Number of books issued by the student : ");
        int numberOfBooks = scannerObject.nextInt();
        student.setNumberOfBooks(numberOfBooks);
        System.out.print("Names of the books issued by the student :\n ");
        Book[] books = new Book[numberOfBooks];
        scannerObject.nextLine();
        for (int i = 0; i < books.length; i++) {
            System.out.println("Name of book " + (i + 1));
            books[i] = new Book(scannerObject.nextLine());
        }
        student.setBooks(books);
        System.out.println("Student Details :");
        System.out.println("Name of the student : " + student.getNameOfStudent());
        System.out.println("University roll number of the student : " +
                student.getUniversityRollNumber());
        System.out.println("Number of books issued by the student : "
                + student.getNumberOfBooks());
        System.out.print("Names of the books issued by the student :\n ");
        student.getNameOfBooks();

    }
}
