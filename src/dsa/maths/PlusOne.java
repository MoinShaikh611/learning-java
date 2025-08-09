package dsa.maths;

import java.util.Stack;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {9,9,9};
			
		 int[] result = returnArr(digits);
		
		 for(int o:result) {
			 System.out.println(o);
		 }
      	}

	static int[] returnArr(int[] digits) {
		  for (int i = digits.length - 1; i >= 0; i--) {
	            if (digits[i] < 9) {
	                digits[i]++;        // just increment and done
	                System.out.println(digits[i]);
	                return digits;      // no extra allocation
	            }
	            digits[i] = 0;         // becomes 0 and carry continues
	        }
	        // If we reach here, all digits were 9 -> result like 1000...0
	        int[] result = new int[digits.length + 1];
	        result[0] = 1;
	        return result;

	}
}
