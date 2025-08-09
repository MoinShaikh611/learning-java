package dsa.maths;

public class RotateNum {

	public static void main(String[] args) {
		int n = 25398;
		int k = 6;

		
		int digits = countDigits(n);
		
		k = k%digits;
		
		int cut = pow10(k); // 10^k Math.pow
		
		int lastPart = n % cut;
		int firstPart = n / cut;
		
		lastPart = lastPart * pow10(digits - k) + firstPart;
		System.out.println(lastPart);
	}
	
	static int countDigits(int num) {
		int count =0;
		while (num != 0) {
			num = num/10;
			count++;
		}
		return count;
	}

	static int pow10(int exp) {
		int result = 1;
		for(int i=0;i<exp;i++) {
			result = result * 10;
		}
		return result;
	}
}
