class Solution {
    fun solution(s: String): String {
        var answer = ""
        var array = arrayListOf<Int>()
        var t = ""
        
        for((i,el) in s.withIndex()) {
            var str = el.toString()
            if(str == "-") {
                t = str
            } else if(str.isNotBlank()) {
                t += str
                if(i == s.length - 1) {
                   array.add(t.toInt())
                   t = "" 
                }
            } else {
                array.add(t.toInt())
                t = ""
            }
        }

        array.sort()
        val max = array.last()
        val min = array.first()
        
        answer = "${min} ${max}"
        
        return answer
    }
}