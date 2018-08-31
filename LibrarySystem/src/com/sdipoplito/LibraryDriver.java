package com.sdipoplito;

import com.sdippolito.library.*;
/**
 * Public library, members may check out books on at a time. Books may only be checked out 
 * by one member at a time. A user may return a book when they are done. This class
 * test the creation of LibraryMember and Book objects. Also includes test case for method
 * functionality.
 * @author qqdipps
 *
 */

public class LibraryDriver  {
//Two items in the library system to begin with, books and library members. Two rules:
//A user can only checkout one book at a time.  
//A book cannot be checked out when it is already checked out.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book harryPotter1 = new Book("The Philosopher's Stone", "J. K. Rowling" , "06-26-1997", "Bloomsbury", false);
		Book harryPotter2 = new Book("The Chamber of Secrets", "J. K. Rowling","07-02-1998", "Bloomsbury", false );
		Book harryPotter3 = new Book("The Prisoner of Azkaban", "J. K  . Rowling", "07-08-1999", "Bloomsbury", false );
		Book harryPotter4 = new Book("The Goblet of Fire", "J. K. Rowling", "07-08-2000", "Bloomsbury", false);
		
		
		LibraryMember member1 = new LibraryMember("Amy", "AAbott", null);
		LibraryMember member2 = new LibraryMember("Billy", "Boblett", null);
		LibraryMember member3 = new LibraryMember("Charlie", "Christoff", null);
		LibraryMember member4 = new LibraryMember("Donald", "Doorson", null);
		LibraryMember member5 = new LibraryMember("Edna", "Enstrum", null);
		
		//--------------Test Case 1----------------//
		System.out.println(" ");
		System.out.println("CASE 1: ");
		// LibraryMember checks out book not checked out,
		// should allow member to check out book, and update book variable checked out
		// to true and update variable bookCheckedOut with book title.
		member1.checkOut(harryPotter1);

		//---------------Test Case 2----------------//
		System.out.println(" ");
		System.out.println("CASE 2: ");
		//LibraryMember checks book out already checked out.
		// Should fail and print book is checked out by another member.
		member2.checkOut(harryPotter1);
		
		//---------------Test Case 3----------------//
		System.out.println(" ");
		System.out.println("CASE 3: ");
		//Library member checks out second book.
		// Should fail and print book member already has checked out.
		member1.checkOut(harryPotter2);
		
		//---------------Test Case 4----------------//
		System.out.println(" ");
		System.out.println("CASE 4: ");
		//Library member returns checked out book to library.
		member1.returnBook(harryPotter1);
		// CHECKS:
		// Should allow member to check out different book. (Case 3)
		member1.checkOut(harryPotter2);
		// Should allow 2nd member to check out returned book. (Case 2)
		member2.checkOut(harryPotter1);
		
		//---------------Test Case 5----------------//
		System.out.println(" ");
		System.out.println("CASE 5: ");
		//Library member returns different book then book attempting to be returned.
		//  Should print to console title of book checked out.
		member1.returnBook(harryPotter1);
		
		//---------------Test Case 6----------------//
		System.out.println(" ");
		System.out.println("CASE 6: ");
		//Library member attempting to return book not checked out to them should not return book checked out to different member
		// To pass Test Case 6 "true" should print to console.
		System.out.println(harryPotter1.equals(member2.getBookCheckedOut()));
		
		
	}
}
