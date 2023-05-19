class Solution {
    fun solution(n: Int): Int  = n / 7 + if (n % 7 != 0) 1 else 0
}