package dsa;

import java.util.*;

public class contains_duplicate {

	public static void main(String[] args) {
		int[] nums= {3,2,3,1};
		Set<Integer> seen= new HashSet<>();
		
		for(int num:nums) {
			if(!seen.add(num)) {
				System.out.println(seen.add(num));
			};
		}
	
		
		seen.add(5); // returns true, 5 is added
		seen.add(10); // returns true, 10 is added
		seen.add(5); // returns false, 5 is already in the set
	}

}
