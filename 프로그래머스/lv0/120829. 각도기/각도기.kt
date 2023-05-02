class Solution {
    fun solution(angle: Int): Int {
        return if(angle > 0 && angle < 90) {
            1
        } else if(angle > 90 && angle < 180) {
            3
        } else if(angle == 90) {
            2
        } else {
            4
        }
    }
}