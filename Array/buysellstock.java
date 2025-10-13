public class buysellstock {
    public int maxprofit(int[] prices){
    int minprice=Integer.MAX_VALUE; // Start with very high minPrice
    int maxprofit=0; // Start with 0 profit
    for(int i=0;i<prices.length;i++){
        int price=prices[i]; // current day's price
        if(minprice>price) minprice=price; // Found a lower price to buy
        else {
            int profit =price-minprice; // What if we sold today?
            if (profit>maxprofit) maxprofit=profit; // Update if it's the best so far
        }
    }
        return maxprofit;
    }
}

