class Solution {
    fun solution(s: String): IntArray {
        var b = s

        var convert = 0
        var zero = 0
            
        while (b != "1") {
            zero += b.replace("1", "").count()
            b = Integer.toBinaryString(b.replace("0", "").count())
            convert ++
        }

       val answer = arrayListOf(convert,zero)
    
       return answer.toIntArray()
    }
}