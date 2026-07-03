class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        var map = mutableMapOf<Int,Int>()
        var resu = mutableListOf<Int>();

        for(i in 0..nums.size){

         var difference = target - nums[i]

         if(map.contains(difference)){
             resu.add(map.getOrDefault(difference,0))
             resu.add(i)
             return resu.toIntArray()
         }

         if(!map.contains(nums[i])){
            map.put(nums[i],i)
         }

        }

        return resu.toIntArray()


    }
}
