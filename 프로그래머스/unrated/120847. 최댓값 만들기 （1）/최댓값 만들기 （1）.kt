class Solution {
    fun solution(numbers: IntArray): Int {    
        numbers.sort()
        numbers.reverse()
        return numbers[0] * numbers[1]
    }
}