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
        while (str[j] != '#') {
            j++
        }
        
         val wordLength = str.substring(i, j).toInt()
        val wordStart = j + 1
        val wordEnd = wordStart + wordLength
         val word = str.substring(wordStart, wordEnd)
         items.add(word)
          i = wordEnd
            
        }
        return items
    }
}

