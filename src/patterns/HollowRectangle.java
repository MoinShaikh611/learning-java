package patterns;

public class HollowRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 4;
		int c = 5;
		
		for(int i =1; i<=r; i++) {
			for(int j=1; j<=c; j++) {
				if(i==1 || j==1 || i == r || j==c) {					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
