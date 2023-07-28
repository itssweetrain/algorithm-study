class Solution {
    fun solution(money: Int): ArrayList<Int> {
       val count = money / 5500
       val changes = money % 5500
       var result = ArrayList<Int>()
       result.add(count)
       result.add(changes)
       return result
    }
}