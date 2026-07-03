class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        var sMap = mutableMapOf<Char,Int>()
        var tMap = mutableMapOf<Char,Int>()

        for(char in s){

            sMap.put(char, sMap.getOrDefault(char,0)+1)
        }

        for(char in t){

            tMap.put(char, tMap.getOrDefault(char,0)+1)
        }

        if(sMap == tMap){
            return true 
        }else {
            return false 
        }

    }
}
