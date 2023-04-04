class Solution {
    fun solution(s: String): String {
        var answer: String = ""  
        
        for(i in s) {
            var k = i.toString()
            if(answer.isBlank() || answer[answer.lastIndex].toString().isBlank()) {
                answer += k.uppercase()
            } else {
                answer += k.lowercase()
            }
        }
            
        return answer
    }
}