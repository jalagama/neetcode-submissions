class Solution {
    fun maxProfit(prices: IntArray): Int {


        var l = 0
        var r = l+1
        var maxprofit = 0

        while( r < prices.size  ){
            var profit = 0
            if(prices[r] < prices[l]){
                l = r
            }else {
                profit = prices[r] - prices[l]
               
            }
               
             r++

            maxprofit = Math.max(maxprofit, profit)

        }

        return maxprofit

    }
}
