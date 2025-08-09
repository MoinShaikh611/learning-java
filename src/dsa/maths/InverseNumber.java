package dsa.maths;

public class InverseNumber {

	public static void main(String[] args) {
		int num = 21453;
		int inverseNum = 0;
		
		int currentPlace = 0;
		int originalPlace = 1;
		
		while(num != 0) {
			int originalDigit = num %10;
			
//			System.out.println(num+" "+originalDigit);
//			21453 3
//			2145 5
//			214 4
//			21 1
//			2 2
			
			int inversePlace = originalDigit;
			int inverseDigit = originalPlace;
			
			inverseNum = inverseNum + inverseDigit * (int)Math.pow(10, inversePlace -1);
			
//			this thing makes the loop increasing and decreasing
			num = num / 10;
			originalPlace++;	
		
			
		}
		
		System.out.println(inverseNum);
		
		
		
		
	}

}
