class Solution {
    fun solution(n: Int, k: Int): Int {
        var freeDrinksCount = n / 10
        return n * 12000 + (k - freeDrinksCount) * 2000
    }
}