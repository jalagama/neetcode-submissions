class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

        var l = 0
        var r = numbers.size - 1

        while(l < r){

            // while(numbers[r] >= target){
            //     r--
            // }

            if(numbers[l] + numbers[r] == target){
                return intArrayOf(l+1, r+1)
            }else if(numbers[l] + numbers[r] > target) {
                r--
            } else {
                l++
            }

        }

        return intArrayOf(0,0)

    }
}
