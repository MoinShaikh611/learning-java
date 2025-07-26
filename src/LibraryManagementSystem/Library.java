package LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
	
	ArrayList<Book> books = new ArrayList<>();
	
	
	public void addBooks(Book book) {
		books.add(book);
	}
	
	public ArrayList<Book> getBooks() {
		return books;
	}
	
	public void removeBookFromLibraryIfSomeOneTake(Book book){
		books.remove(book);
	}
	
	
	
}
