class Solution {
    fun longestConsecutive(nums: IntArray): Int {

       var set = nums.toSet()

       var longest = 0

       for(num in nums){
            // first find is it start sequnce 

            if(!set.contains(num-1)){
                var length = 1
                // loop through how many consequtive are there
                var nextNum = num+1
                while(set.contains(nextNum)){
                    length += 1
                    nextNum++
                }
                longest = Math.max(longest,length)
            }
       }

        return longest

    }
}
