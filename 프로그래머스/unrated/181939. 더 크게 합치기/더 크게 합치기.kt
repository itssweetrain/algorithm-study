class Solution {
    fun solution(a: Int, b: Int): Int {
        val aStr = a.toString()
        val bStr = b.toString()
        return if(aStr + bStr >= bStr + aStr) (aStr + bStr).toInt() else (bStr + aStr).toInt()
    }
}