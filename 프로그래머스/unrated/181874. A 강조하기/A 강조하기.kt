class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        for(i in myString) {
            val str = i.toString()
            if(str == "a") answer += "A" else if(str != "A") answer += str.toLowerCase() else answer += str
        }
        return answer
    }
}