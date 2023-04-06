class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var remainder = k
        
        val sorted = tangerine.groupBy { it }.toList().sortedByDescending { it.second.size }
        for(i in sorted) {
            answer ++
            remainder -= i.second.size 
            
            if(remainder <= 0) {
                break
            }
        }

        return answer
    }
}