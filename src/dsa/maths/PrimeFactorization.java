package dsa.maths;

import java.util.*;

public class PrimeFactorization {

	public static void main(String[] args) {
		int[] nums = {2,14,19,19,5,13,18,10,15,20};
        Set<Integer> mySet = new HashSet<>();

		
		for(int item:nums) {
			int num = item;
			int i = 2;
			while (num > 1) {
				if(num%i==0) {
					num = num/i;
					mySet.add(i);
				}else {
					i++;
				}
			}
		}
	
	
		System.out.println(mySet.size());
	}

}
