package com.sdippolito.library;

/**
 * LibraryMember class describes library data members: first name, last name, Book checked out
 * and methods checkOutBook, returnBook, and getters/setter for data members.
 * 
 * @author qqdipps 
 *
 */
public class LibraryMember {
	
//	data members: first name, last name, Book checked out
	/**
	 * First name of library member.
	 */
	private String firstName;
	
	/**
	 * Last name of library member.
	 */
	private String lastName;
	
	/**
	 * Title of book checked out by library member.
	 */
	private Book bookCheckedOut;
		
//	methods: constructor, appropriate getters and setters, checkOutBook, returnBook
	/**
	 * Constructor initializes private variables data members: first name, 
	 * last name, Book checked out
	 * @param firstName
	 * @param lastName
	 * @param bookCheckedOut
	 */
	public LibraryMember(String firstName, String lastName, Book bookCheckedOut) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookCheckedOut = bookCheckedOut;
	}

	/**
	 * Method used to allow library members to check out books.
	 * Library members cannot check out book that is checked out already.
	 * Library members can not check out more than one book. 
	 * @param book
	 */
//	Method will take a Book object as a parameter
//	this method will print statements to the console
	public void checkOut(Book book) { 
//	if the book is not checked out then the LibraryMember will get the book
		checkOutLoop: if (book.getCheckedOut() == false) {
			if (getBookCheckedOut() == null) {
//	set the LibraryMember’s bookCheckedOutBook data member to the book passed into the method
			setBookCheckedOut(book);
//	set the book’s checked out data member to true
			book.setCheckedOut(true);
//	print “User checked out book” if the books got checked out
			System.out.println(getFirstName() + " checked out book: " + book.getTitle() + ".");
			}
			else {
// print “User failed to check out book” if the book check out failed.
				System.out.print(getFirstName() + " failed to check out book. ");
				System.out.println(getFirstName() + " already has book, " + getBookCheckedOut().getTitle() + " checked out. ");
				System.out.println("Please return " + getBookCheckedOut().getTitle() + " to check out " + book.getTitle());
				break checkOutLoop;
			}
		}
		else {
//	print “User failed to check out book” if the book check out failed.
			System.out.println(getFirstName() + " failed to check out book: " + book.getTitle() );
			System.out.println(book.getTitle() + " is already checked out. Please select a different book. "  );
		}		
	}
	
	/**
	 * Method returns book to library.
	 * @param book
	 */
	public void returnBook(Book book) {
		//If member has book checked out:
		if(getBookCheckedOut().equals(book)) {
			// Print book returned.
			System.out.println(getFirstName() + " has returned, " + book.getTitle() + ", to library.");
			// Reset member variable bookCheckedOut to null.
			book.setCheckedOut(false);
			// Reset book variable checkOut to false.
			setBookCheckedOut(null);
		}
		//If member does not have book checked out
		else if (getBookCheckedOut().equals(null)) {
			// if member has no book checked out print "No books to return".
			System.out.println(getFirstName() + " does not have any books checked out to return. ");
		}
		// Check to see if member has different book checked out.
		else {
			// If member has different book print to console title of book checked out.
			System.out.println(getFirstName() + " has " + getBookCheckedOut().getTitle() +" checked out. Please return " + getBookCheckedOut().getTitle() + ".");
		}
	}
	/**
	 * Methods gets firstName.
	 * @return String firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Method sets private variable firstName.
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Methods gets lastName.
	 * @return String lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Method sets private variable lastName.
	 * @param firstName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Methods gets bookCheckedOut.
	 * @return String chechedOut
	 */
	public Book getBookCheckedOut() {
		return bookCheckedOut;
	}
	
	/**
	 * Method sets private variable bookCheckedOut.
	 * @param bookCheckedOut
	 */
	public void setBookCheckedOut(Book bookCheckedOut) {
		this.bookCheckedOut = bookCheckedOut;	
	}	
}