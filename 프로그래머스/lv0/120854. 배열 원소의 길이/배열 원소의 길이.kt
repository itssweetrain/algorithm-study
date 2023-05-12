class Solution {
    fun solution(strlist: Array<String>): ArrayList<Int> {
        var result = ArrayList<Int>()
        var len = 0
        
        for(i in strlist) {
            result.add(i.length)   
        }
        return result
    }
}