class Solution {
    fun solution(n: Int): Int = n.toString().sumBy { it.toInt() - 48 }
}