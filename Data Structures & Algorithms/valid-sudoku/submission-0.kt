class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {

       

        for(i in 0 until 9){
           var rows = hashSetOf<Char>()
           var cols = hashSetOf<Char>()
           var square = hashSetOf<Char>()
            for(j in 0 until 9){
               
               var rowval = board[i][j]
                if(rowval != '.' ) {
                    if (!rows.add(rowval)) return false
                } 

                var colval = board[j][i]
                if(colval != '.' ) {
                    if (!cols.add(colval)) return false
                } 

                 val r = 3 * (i / 3) + j / 3
                 val c = 3 * (i % 3) + j % 3

               val boxVal = board[r][c]
                if (boxVal != '.') {
                    if (!square.add(boxVal)) return false
                }

            }
        }

        return true


    }
}
