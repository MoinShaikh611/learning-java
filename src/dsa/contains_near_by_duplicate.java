package dsa;

import java.util.*;

public class contains_near_by_duplicate {

	public static void main(String[] args) {
		int a[] = {1,2,3,1,2,3};
		int k=2;
		containsNearbyDuplicate(a, k);
	
	}
	
	   public static boolean containsNearbyDuplicate(int[] nums, int k) {
			Map<Integer,Integer> myMap = new HashMap<>();
			
			for(int i = 0;i<nums.length -1;i++) {
				if(!myMap.containsKey(nums[i])) {
					myMap.put(nums[i], i);
				}else {
					int diff = Math.abs(myMap.get(nums[i]) - i); // last index - current index where the number is equal
					if(diff<=k) {
						return true;
					}else {
						myMap.put(nums[i], i);
					}
				}
			}
	        return false;
	    }

}
