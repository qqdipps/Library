# Library
Library project
* Public library, members may check out books on at a time. Books may only be checked out by one member at a time. A user may return a book when they are done.

Book class @ Library/LibrarySystem/src/com/sdippolito/library/Book.java
 Book class describes book data members:
 * title, author, published date, publishing company, checked out and methods: printStatus , getters/setters.
 * @author qqdipps

LibraryMember class @ Library/LibrarySystem/src/com/sdippolito/library/LibraryMember.java
 * LibraryMember class describes library data members: first name, last name, Book checked out and methods checkOutBook, returnBook, and getters/setter for data members.
 * @author qqdipps 

DateFormatterException class @ Library/LibrarySystem/src/com/sdippolito/library/DateFormatterException.java
 * Handles date formating.
 * Thrown in  Book class if regex pattern does not match date format of publishDate passed in the constructor of Book object.
 * @author qqdipps

LibraryDriver class @ Library/LibrarySystem/src/com/sdipoplito/LibraryDriver.java
 * LibraryDriver class test the creation of LibraryMember and Book objects. Also includes test case for method functionality.
 * @author qqdipps

