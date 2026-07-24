class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

        var l = 0
        var r = numbers.size - 1
        var resu = IntArray(2) {0}

        while(l < r){
           
           if(numbers[l] + numbers[r] > target){
                r--
           }else if (numbers[l] + numbers[r] < target){
                l++
           }
           
           if (numbers[l] + numbers[r] == target){
                resu[0] = l+1
                resu[1] = r+1
                return resu
           }

        }
        return resu
    }
}
