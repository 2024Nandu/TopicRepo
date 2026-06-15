package com.visible;


	class Book {
	    public void checkOut() {
	        System.out.println("Book checked out quickly!");
	    }
	    public void returnBook() {
	        System.out.println("Book returned immediately!");
	    }
	    public void catalog() {
	        System.out.println("Book cataloged efficiently!");
	    }
	}



	public class Mmmm {
	    public static void main(String[] args) {
	        Book book = new Book();
	        manageBook(book);
	    
	        Book book2 = new Book();
	        manageBook(book2);
	    }

	    public static void manageBook(Book book) {
	        book.checkOut();
	        book.returnBook();
	        book.catalog();
	    }
	}


