class Solution {
    fun solution(message: String): Int {
        return strLen(message) * 2 
    }
    
    fun strLen(message: String): Int {
        var count = 0
        
        for(i in message) {
            count ++
        }
        
        return count
    }
}