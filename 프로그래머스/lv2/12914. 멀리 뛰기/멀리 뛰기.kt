class Solution {
    fun solution(n: Int): Long {
        var p = arrayListOf(0,1,2)
        
        if (n == 1) return 1 
        if (n == 2) return 2 

        for(i in 3..n) {
            p.add(i, (p[i-1] + p[i-2]) % 1234567)
        }

        return p[n].toLong()
    }
}