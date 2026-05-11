class Solution {
    fun isPalindrome(s: String): Boolean {

       var l = 0
       var r = s.length - 1

       while (l < r) {
        while(l < r && !isAlphaNumeric(s[l])) {
                l++
         }
        while(l < r && !isAlphaNumeric(s[r])) {
                r--
        }


        if(s[l].lowercaseChar() == s[r].lowercaseChar()){
            l++
            r--
        }else {
            return false 
        }
       }

        return true

    }

    fun isAlphaNumeric(temp:Char) : Boolean {

        return (temp in 'A'..'Z') ||
       (temp in 'a'..'z') ||
       (temp in '0'..'9')
    }
}
