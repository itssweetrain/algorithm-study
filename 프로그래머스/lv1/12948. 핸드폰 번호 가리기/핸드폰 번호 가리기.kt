class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        var n = phone_number
        
        var visible = n.substring(n.lastIndex - 3, n.lastIndex + 1)
        var invisible = n.substring(0, n.lastIndex - 3)
        var star = "*".repeat(invisible.length)
        
        return star + visible
    }
}