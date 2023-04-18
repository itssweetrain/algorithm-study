class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = 0
        
        for((i,e) in seoul.withIndex()) {
            if(e == "Kim") answer = i    
        }
        
        return "김서방은 ${answer}에 있다"
    }
}