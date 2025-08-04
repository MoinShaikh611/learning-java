package dsa;

public class best_time_to_buy_and_sell_stock {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {		
		int max_profit = 0;
		int current_profit = 0;
		int lowest_price = prices[0];
		for(int i =1;i<prices.length;i++) {
			if(lowest_price >= prices[i]) {
				lowest_price = prices[i];
			}else {				
				current_profit = prices[i] - lowest_price;
			}
			max_profit = Math.max(current_profit,max_profit);
		}
		
		return max_profit;
    }

}


