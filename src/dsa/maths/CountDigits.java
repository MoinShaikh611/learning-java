package dsa.maths;

public class CountDigits {

	public static void main(String[] args) {
		int n = 3498;
		
//		if(n == 0) System.out.println(1);
//		n = Math.abs(n); //handle negative number
//		
//		int counter = 0;
//		while(n>0) {
//			n=n/10;
//			counter++;
//		}
//		
//		System.out.println(counter);
		
	
	}
	
	private static void printDigits(int n ) {
		
		int counter = 0;
		int temp = n;

		while(temp != 0) {
			temp=temp/10;
			counter++;
		}
		
		 int divisor = (int) Math.pow(10, counter-1);
		 System.out.println(divisor);
		 
		 while(n!=0) {
			 int quotient = n/divisor;
			 System.out.println(quotient);
			 n = n%divisor;
			 divisor= divisor/10;
		 }
	}
			

}
