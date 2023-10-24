class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
        val answer = numbers.slice(num1..num2).toIntArray()
        return answer
    }
}