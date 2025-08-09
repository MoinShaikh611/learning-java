package dsa;

import java.util.Arrays;

public class IsPrime {

//	Sieve of Eratosthenes
	public static boolean[] generatePrimes(int n) {
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime,true); //assume all prime initially
		isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime
		
		
		
		for(int i=2; i*i<= n;i++) {
			if(isPrime[i]) {
				for(int j=i*i; j<=n; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		return isPrime;
	}
	
	public static void main(String[] args) {
		int limit = 100;
		
		boolean[] primeArray = generatePrimes(limit);
		
		for(int i=2; i <= limit; i++) {
			if(primeArray[i]) {	
				System.out.println();
				System.out.print(i + " ");
			}
		}
	}

}
