class Solution {
    fun solution(num: Int): Int {
        return processor(num.toLong(), 0)
    }
    
    private fun processor(n: Long, c: Int): Int {
        if(n == 1.toLong()) return c
        if(c > 500) return -1
        return processor(if(n % 2 == 0.toLong()) n / 2 else n * 3 + 1, c + 1)
    }
}