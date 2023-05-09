class Solution {
    fun solution(numbers: IntArray): ArrayList<Int> {
        var result: ArrayList<Int> = arrayListOf()
        for(i in numbers) {
            result.add(i * 2)
        }
        return result
    }
}