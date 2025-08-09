package dsa.maths;

public class ReverseNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int x= -15346469;
	    long sum = 0;
        while (x != 0) {
            int y = x % 10;
            sum = sum * 10 + y;
            x = x / 10;
        }
        if (sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE) System.out.println(0);;
        System.out.println(Math.toIntExact(sum));
		
		
	}

}
