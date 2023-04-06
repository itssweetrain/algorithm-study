class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        val paper = arrayListOf<Int>()
        
        citations.sort()
        for(i in 0..citations.last()) {
            val count = citations.count { it >= i }
            paper.add(count)    
        }
    
        paper.sortDescending()
        for((i,e) in paper.withIndex()) {
            if(e >= i) answer = i
        }

        return answer
    }
}