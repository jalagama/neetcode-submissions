class Solution {
    fun trap(height: IntArray): Int {

        var l = 0
        var r = height.size - 1
        var totalWater = 0
        var maxL = 0
        var maxR = 0

        while(l < r){

            maxL = Math.max(maxL, height[l])
            maxR = Math.max(maxR, height[r])


           var storage = 0

            if(height[l] < height[r]){
                l++
             storage = Math.min(maxL,maxR) - height[l]

            }else{
                r--
             storage = Math.min(maxL,maxR) - height[r]

            }

             if(storage >= 0){
                totalWater = totalWater + storage
            }

           
            


        }

        return totalWater

    }
}
