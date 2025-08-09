package dsa;

import java.util.Iterator;

public class PrintAllFibinacciTillN {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 8;

		
		int previousEle = 0;
		int currentEle = 1;

		for (int i = 0; i < n; i++) {
			System.out.println(previousEle);
			int nextEle = previousEle + currentEle;
			previousEle = currentEle;
			currentEle = nextEle;
		}
		
		
	}
}
