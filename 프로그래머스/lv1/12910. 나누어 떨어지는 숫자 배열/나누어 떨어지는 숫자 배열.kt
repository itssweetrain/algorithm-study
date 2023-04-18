class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = arrayListOf<Int>()
        
        for(i in arr) {
            if(i % divisor == 0) answer.add(i)
        }
        
        if(answer.isEmpty()) answer.add(-1)
        
        return answer.sorted().toIntArray()
    }
}