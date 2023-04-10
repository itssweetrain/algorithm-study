class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var count = 0
        var entry_num_a = a
        var entry_num_b = b
        
        while(entry_num_a != entry_num_b) {
            count ++
            entry_num_a = Math.round(entry_num_a.toDouble()/2).toInt()
            entry_num_b = Math.round(entry_num_b.toDouble()/2).toInt()
        }
    
        return count 
    }
}