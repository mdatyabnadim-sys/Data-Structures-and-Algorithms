public class buysellstock {
    public int maxprofit(int[] prices){
    int minprice=Integer.MAX_VALUE;
    int maxprofit=0;
    for(int i=0;i<prices.length;i++){
        int price=prices[i];
        if(minprice>price) minprice=price;
        else {
            int profit =price-minprice;
            if (profit>maxprofit) maxprofit=profit;
        }
    }
        return maxprofit;
    }
}
