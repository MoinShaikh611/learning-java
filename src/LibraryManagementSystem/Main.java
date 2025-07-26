package LibraryManagementSystem;

public class Main {

	public static void main(String[] args) {
		
		Library library = new Library();

		Book book1 = new Book("harry1 porter");
		Book book2 = new Book("harry2 porter");
		Book book3 = new Book("harry3 porter");
		Book book4 = new Book("harry4 porter");
		Book book5 = new Book("harry5 porter");

		library.addBooks(book1);
		library.addBooks(book2);
		library.addBooks(book3);
		library.addBooks(book4);
		library.addBooks(book5);
		
		MemberService memberService = new MemberService(library);
		
		memberService.registerMember("Moin");
		memberService.registerMember("Ayaan");
		
		memberService.bookTakenFromLibrary("Moin", book5);
		memberService.bookTakenFromLibrary("Ayaan", book1);

		System.out.println("Books remaining in library.");

		for(Book book:library.getBooks()) {
			System.out.println(book);
		}
		
		System.out.println("\nBooks After Returning");
		
		memberService.returnBookToLibrary("Moin",book3);
		
		for(Book book:library.getBooks()) {
			System.out.println(book);
		}
	}

}
