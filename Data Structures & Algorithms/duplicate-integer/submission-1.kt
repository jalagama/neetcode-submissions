class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        var map = mutableMapOf<Int,Int>()

        for(num in nums){

           
         map.put(num, map.getOrDefault(num,0)+1)
     
       if(map.getOrDefault(num,0) > 1){
                return true 
            }
        }

        return false 

    }
}
