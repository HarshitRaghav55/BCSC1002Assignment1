/*  Created by IntelliJ IDEA.
 *  User: Harshit Raghav (HarshitRaghav55)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int ISSUE_NEW_BOOK = 1;
    public static final int RETURN_PREVIOUSLY_ISSUES = 2;
    public static final int SHOW_ALL_ISSUES = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Student student = new Student();
        Library library = new Library();
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
        student.displayNameOfBooks();
        int choice;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n" +
                    "How may I help you today?\n" +
                    "1. Issue a new book for me.\n" +
                    "2. Return a previously issues book for me.\n" +
                    "3. Show me all my issues books.\n" +
                    "4. Exit.\n");
            System.out.println("Your Choice : ");
            choice = scannerObject.nextInt();
            scannerObject.nextLine();
            switch (choice) {
                case ISSUE_NEW_BOOK:
                    Book newBook = new Book();
                    System.out.println("Enter the details of the Book");
                    System.out.print("Enter the Book name : ");
                    newBook.setBookName(scannerObject.nextLine());
                    System.out.print("Enter the Author name : ");
                    newBook.setAuthorName(scannerObject.nextLine());
                    System.out.print("Enter the ISBN number : ");
                    newBook.setISBNNumber(scannerObject.nextLine());
                    student.addNewBook(newBook);
                    System.out.println("Book Issued!!!!");
                    break;
                case RETURN_PREVIOUSLY_ISSUES:
                    System.out.println();
                    break;
                case SHOW_ALL_ISSUES:
                    System.out.println();
                    break;
                case EXIT:
                    System.out.println("Bye!!!\n Have a good day!!!");
                    continue;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        } while (choice != EXIT);
    }
}
