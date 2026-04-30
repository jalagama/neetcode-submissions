class Solution {

    fun encode(strs: List<String>): String {
     var encodeString = ""

     for(item in strs){
        encodeString += "${item.length}#${item}"
     }

     return encodeString

    }

    fun decode(str: String): List<String> {

        var items = mutableListOf<String>()
        
        var i = 0

        while(i < str.length){

            var j = i

            while(str[j] != '#'){
                j++
            }

            var wordLength = str.substring(i,j).toInt()

            var wordStart = j+1
            var end = wordStart + wordLength

            var word = str.substring(wordStart, end)
            items.add(word)
            i = end

        }
       
        return items
    }
}

