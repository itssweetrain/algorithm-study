class Solution {
    fun solution(arr: IntArray): Int {
        arr.sort()
        var answer = arr[0]

        for(i in 1..arr.lastIndex) {   
            var prev_common_multiple = answer  
            var common_multiple = arr[i] 
           
            val max = Math.max(prev_common_multiple, common_multiple)
            
            for(j in max downTo 1) {
                if(prev_common_multiple % j == 0 && common_multiple % j == 0) {
                    prev_common_multiple = arr[i-1] / j
                    common_multiple = arr[i] / j
                    break
                }
            }
            answer = answer * common_multiple   
        }
        
        return answer
    }
}