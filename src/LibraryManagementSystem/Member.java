package LibraryManagementSystem;

import java.util.ArrayList;

public class Member {
	private String name;
	private ArrayList<Book> borrowedBooks = new ArrayList<>();
	
	public Member(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Book> getBorrowedBooks(){
		return borrowedBooks;
	}
	
	public void borrowBook(Book book) {
		borrowedBooks.add(book);
	}
	
	public void returnBook(Book book) {
		borrowedBooks.remove(book);
	}
	
	@Override
	public String toString() {
		return "Member{name='" + name + "', borrowedBooks=" + borrowedBooks + "}";
	}
	
	
}
