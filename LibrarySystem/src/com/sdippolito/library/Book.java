package com.sdippolito.library;

import java.util.Calendar;
import java.util.regex.Pattern;


/**
 * Book class describes book data members:
 * title, author, published date, publishing company, checked out
 * and methods: printStatus , getters/setters.
 * @author qqdipps
 *
 */
public class Book {
	
//	data members: title, author, published date, publishing company, checked out
	/**
	 * Title of book.
	 */
	private String title;
	
	/**
	 * Author of book.
	 */
	private String author;
	
	/**
	 * Publish date of book.
	 */
	private Calendar publishDate;
	
	/**
	 * Publishing company of book.
	 */
	private String publishingCompany;
	
	/**
	 * Status of book, true if checked out
	 * false if not checked out
	 */
	private Boolean checkedOut;
	
	
	
//	methods: constructor, appropriate getters and setters, printStatus
	
	/**
	 * Constructor arguement initializes private variable data members: title, 
	 * author, published date, publishing company, checked out
	 * @param title
	 * @param author
	 * @param publishDate
	 * @param publishingCompany
	 * @param checkedOut
	 */
	public Book(String title, String author, String publishDateStringFormat, String publishingCompany, Boolean checkedOut){
		this.title = title;
		this.author = author;
		setPublishDate(publishDateStringFormat); 
		this.publishingCompany = publishingCompany;
		this.checkedOut = checkedOut;
	}
	
	/**
	 *Method will print to the console “Book is not checked out.”. If the book 
	 *is not checked out, otherwise the it will print “Book is checked out.”.
	 */
 	public void printStatus() {
 		
 	
 		if (getCheckedOut() == false ) {
 			System.out.println("Book is not checked out. ");
 		}
 		else {
 			System.out.println("Book is checked out. ");
 		}
	
	}
	
	
	/**
	 *Method gets title.
	 * @return String title
	 */
	public String getTitle() {
		return title;
	}
	
	/*
	 * Method used to set private variable title.
	 * @param String title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 *Method gets author.
	 * @return String author
	 */
	public String getAuthor() {
		return author;
	}
	
	/*
	 * Method used to set private variable author.
	 * @param String author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 *Method gets publishDate.
	 * @return Date publishDate
	 */
	public Calendar getPublishDate() {
		return publishDate;
	}
	
	/*
	 * Method used to set private variable publishDate.
	 * @param Date publishDate
	 */
	public void setPublishDate(String publishDateStringFormat){
		try {	
		//99-99-9999 /\d\d[-]\d\d[-]\d\d\d\d/
			if (!(Pattern.matches("\\d\\d[-]\\d\\d[-]\\d\\d\\d\\d", publishDateStringFormat))) {	
				throw new DateFormatterException("MM-DD-YYYY");
			}
			else {
				int mm = Integer.parseInt(publishDateStringFormat.substring(0,2));
				int dd = Integer.parseInt(publishDateStringFormat.substring(3,5));
				int yyyy = Integer.parseInt(publishDateStringFormat.substring(6));
				publishDate = Calendar.getInstance();
				publishDate.set(yyyy,mm - 1,dd);
			}
			}catch(DateFormatterException e1) {
				System.out.println(e1.toString());
				publishDate = e1.defaultDate();
			}
	}
		
	/**
	 *Method gets publishingCompany.
	 * @return String publishingCompany
	 */
	public String getPublishingCompany() {
		return publishingCompany;
	}
	
	/*
	 * Method used to set private variable publishingCompany.
	 * @param String publishingCompany
	 */
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	
	/**
	 *Method gets checkedOut.
	 * @return Boolean checkedOut
	 */
	public Boolean getCheckedOut() {
		return checkedOut;
	}
	
	/*
	 * Method used to set private variable checkedOut.
	 * @param Boolean checkedOut
	 */
	public void setCheckedOut(Boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
}



