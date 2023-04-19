class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        
        for(i in arr) {
            if(i % divisor == 0) answer += i
        }
        
        if(answer.isEmpty()) answer += -1
        
        return answer.sortedArray()
    }
}