class Solution {
    fun solution(array: IntArray, height: Int): Int {
       var result = 0
       for(i in array) {
           if(i > height) {
               result ++
           }
       }
       return result
    }
}