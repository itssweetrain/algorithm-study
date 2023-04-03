class Solution {
    fun solution(s: String): Int {
        var t: String = s
        val array = arrayListOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
        for(i in array) {
            t = t.replace(i, array.indexOf(i).toString())
            println(t)
        }
        return t.toInt()
    }
}