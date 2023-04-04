class Solution {
    fun solution(s: String): IntArray {
        var b = s

        var translateCount = 0
        var deleteCount = 0
        
        fun makeBinary(s: String) {
            b = ""
            for(i in s) {
                val str = i.toString()
                if(str == "0") {
                    deleteCount ++
                } else {
                    b += str
                }
            }
            b = Integer.toBinaryString(b.length) 
            translateCount ++
        }
            
       do {
           makeBinary(b)  
       } while (b != "1")

       val answer = arrayListOf(translateCount,deleteCount)
    
       return answer.toIntArray()
    }
}