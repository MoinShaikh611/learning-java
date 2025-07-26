package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;

public class MemberService {
	private Library library;
	private HashMap<String,Member> members = new HashMap<>();
	
	public MemberService(Library library) {
		this.library = library;
	}
	
	public void registerMember(String name){
		members.put(name, new Member(name));
	}
	
	public void bookTakenFromLibrary(String memberName,Book book){
		Member member = members.get(memberName);
		if(member != null && library.getBooks().contains(book)) {
			member.borrowBook(book);
			library.removeBookFromLibraryIfSomeOneTake(book);
		}else {
			System.out.println("Book not available or member not found.");

		}
	}
	
	public void returnBookToLibrary(String memberName, Book book) {
		Member member = members.get(memberName);
		if(member != null && member.getBorrowedBooks().contains(book)) {
			member.returnBook(book);
			library.addBooks(book);
		}
	}
}
