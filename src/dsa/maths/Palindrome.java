package dsa.maths;

public class Palindrome {
	public static void main(String[] args) {
		int x = 121;
		int temp = x;
		int cur = 0;

		while(temp!=0) {
			cur = cur * 10 + temp % 10;
			temp = temp / 10;
			
		}
		System.out.println(x);
		System.out.println(cur);
		System.out.println(cur == x);
		
	}	
}
