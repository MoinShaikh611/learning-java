package exception_handling;


public class Main {

	public static void main(String[] args) {
		try {
			int myInt = Integer.parseInt("p1231");	
			System.out.println(myInt);
		}
		catch (NumberFormatException | NullPointerException e) {
			System.out.println("String cannot be parsed to integer");
		}
		finally {
			System.out.println("Finally");
		}
		
		System.out.println(printAll());
	}
	
	private static int printAll() {
		try {
			return 2;
		}
		catch(Exception e){
			return 3;
		}
		finally {
			return 5; // it will override the try and catch block and output is 5
		}
		
	}

}
