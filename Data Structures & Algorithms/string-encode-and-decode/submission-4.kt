class Solution {

    fun encode(strs: List<String>): String {
       val sb = StringBuilder()

       for (s in strs) {
            sb.append(s.length)
            sb.append('#')
            sb.append(s)
        }

        return sb.toString()
    }

    fun decode(str: String): List<String> {

        val result = mutableListOf<String>()
         var i = 0

           while (i < str.length) {

              var j = i
             while (str[j] != '#') {
                j++
             }

             val len = str.substring(i, j).toInt()

            val start = j + 1
            val end = start + len

            result.add(str.substring(start,end))

            i = end

           }

            return result
    }
}
