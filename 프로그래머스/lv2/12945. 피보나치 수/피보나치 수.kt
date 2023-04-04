class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var array = arrayListOf(0,1)
    
        if(n > 2) {
            for(i in 3..n + 1) {
                array.add(array[i - 2] % 1234567 + array[i - 3] % 1234567)
            } 
            answer = array[n]
        } else {
            answer = 1
        }
    
        return answer % 1234567
    }
}