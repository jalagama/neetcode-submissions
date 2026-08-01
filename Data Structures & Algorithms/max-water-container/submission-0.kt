class Solution {
    fun maxArea(heights: IntArray): Int {

        var result = 0

        var left = 0
        var right = heights.size - 1

        while(left < right){

            var min = Math.min(heights[left] , heights[right]) 
            var container = min * (right - left)

            if(heights[left] < heights[right]){
                left++
            } else {
                right--
            }

            result = Math.max(result, container)
        }

        return result

    }
}
