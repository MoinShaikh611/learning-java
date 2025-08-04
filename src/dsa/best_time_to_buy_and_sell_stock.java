package dsa;

public class best_time_to_buy_and_sell_stock {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {		
			int profit = 0;
			for(int i=0;i<prices.length-1;i++) {
				if((prices[i] > prices[i+1])) {					
					System.out.println( prices[i] +" "+(prices[i]-prices[i+1]));
				}
			}
			return profit;
    }

}


