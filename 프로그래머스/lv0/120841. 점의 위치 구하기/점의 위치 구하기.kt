class Solution {
    fun solution(dot: IntArray): Int {
        val x = dot[0]
        val y = dot[1]
        return if (x > 0 && y > 0) {
            1
        } else if(x < 0 && y > 0) {
            2
        } else if(x < 0 && y < 0) {
            3
        } else {
            4
        }
    }
}