public class Solution {
        public int maxProfit(int[] prices) {

            int bDay=0;
            int sDay=1;
            int maxProfit=0;
            int profit=0;

            while(sDay<prices.length){
                if(prices[bDay]<prices[sDay]){
                    profit=prices[sDay]-prices[bDay];
                    maxProfit = Math.max(profit,maxProfit);
                }
                else{
                    bDay=sDay;
                }
                sDay++;
            }
            return maxProfit;
        }
    }

