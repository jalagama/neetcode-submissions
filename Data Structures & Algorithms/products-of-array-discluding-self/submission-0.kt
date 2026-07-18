class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        var prefix = IntArray(nums.size){1}
        var suffix = IntArray(nums.size){1}

        var ans = IntArray(nums.size){1}

        for(i in 1 .. nums.size - 1){
           prefix[i] = prefix[i-1] * nums[i-1]
        }
        
        for(j in nums.size - 2 downTo 0){
            suffix[j] = suffix[j+1] * nums[j+1]
        }

        for(k in 0 .. nums.size-1){
            ans[k] = prefix[k] * suffix[k]
        }

        return ans
    }
}
