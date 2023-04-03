class Solution {
    
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var count = 0
        var result = arrayListOf<Int>()
        
        for(i in moves) {
            val n = i - 1
            for((j, el) in board.withIndex()) {
               if(el[n] != 0) {
                    if(result.isNotEmpty() && result.last() == el[n]) { 
                        result.removeLast()
                        count += 2
                    } else {
                        result.add(el[n])
                    }
                    el[n] = 0
                    break               
                }
            }
        }
 
        return count
    }
}