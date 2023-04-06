class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        val categories = arrayListOf<Int>()
        var remainder = k
        
        tangerine.sort()
    
        var cnt = 0
        for(i in 0..tangerine.size - 1) {
            cnt ++
            
            if ((i < tangerine.size - 1 && tangerine[i] != tangerine[i+1]) || (i == tangerine.size - 1 && cnt > 0)) {
                categories.add(cnt)
                cnt = 0
            }  
        }
        
        categories.sortDescending()
        
        for(i in categories) {
            answer ++
            remainder -= i
            
            if(remainder <= 0) {
                break
            }
        }

        return answer
    }
}