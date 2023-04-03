class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var count = 0
        var array = arrayListOf<String>()
        var str = x.toString()
        
        for(i in str) {
            array.add(i.toString())
        }
        for(i in 0..array.size - 1) {
            count += array[i].toInt()    
        }
        answer = x%count == 0
        return answer
    }
}