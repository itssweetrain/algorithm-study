class Solution {
    fun solution(num_list: IntArray): ArrayList<Int> {
        var result: ArrayList<Int> = ArrayList<Int>()
        var odd_count: Int = 0
        var even_count: Int = 0 
        for(i in num_list) {
            if(i % 2 == 0) even_count ++ else odd_count ++
        }
        result.add(even_count)
        result.add(odd_count)
        
        return result
    }
}