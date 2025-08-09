package dsa.maths;

public class CommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 25;
		int y = 30;
		int counter = 0;
		int n = 0;
		for(int i=1;i<=n;i++) {
			if(x%i ==0 & y%i==0) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
