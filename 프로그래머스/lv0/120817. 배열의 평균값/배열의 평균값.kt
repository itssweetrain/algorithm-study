class Solution {
    fun solution(numbers: IntArray): Double {
        var result = 0
        for(i in numbers) {
            result += i
        }
        return result.toDouble() / numbers.count()
    }
}