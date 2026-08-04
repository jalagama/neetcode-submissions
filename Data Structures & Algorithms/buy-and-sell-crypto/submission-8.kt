class Solution {
    fun maxProfit(prices: IntArray): Int {
            
        var l = 0
        var r = l+1
        var maxProfit = 0

        while( r < prices.size){
            var profit = 0
            if(prices[r] > prices[l]){
                profit = prices[r] - prices[l]
                maxProfit = Math.max(maxProfit , profit)
            }else {
                l = r 
            }
         
            r++
        }

        return maxProfit
    }
}
