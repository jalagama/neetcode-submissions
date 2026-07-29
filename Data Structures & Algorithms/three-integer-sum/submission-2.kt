class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        var result = mutableListOf<List<Int>>()
        nums.sort()
        for(i in 0 until nums.size){

            var left = i+1
            var right = nums.size-1


            while(left < right){

                var sum = nums[left] + nums[right] + nums[i]

                if(sum == 0){

                    var list = mutableListOf<Int>()
                    list.add(nums[left])
                    list.add(nums[right])
                    list.add(nums[i])

                    if(!result.contains(list)){
                        result.add(list)
                    }
                    left++
                    right--

                }else if(sum > 0){
                    right --
                }else {
                    left++
                }


            }
            
        }

        return result

    }
}
