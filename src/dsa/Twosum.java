package dsa;

import java.util.*;

public class Twosum {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		System.out.println(twoSum(nums, target));	
	}
	 static public int[] twoSum(int[] nums, int target) {
	     Map<Integer,Integer> myMap = new HashMap<>();
	     for(int i=0;i<nums.length;i++) {
	    	 int compliment = target - nums[i];
	    	 if(myMap.containsKey(compliment)) {
	    		 return new int[] {myMap.get(compliment),i};
	    	 }
	    	 myMap.put(nums[i], i);
	     }
		 return new int[] {};
	 }

}
