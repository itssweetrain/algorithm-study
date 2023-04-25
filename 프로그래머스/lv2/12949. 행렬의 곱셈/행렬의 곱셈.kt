class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): ArrayList<IntArray> {
        var answer = arrayListOf<IntArray>()
        
        for(i in 0..arr1.size - 1) {
            var temp = arrayListOf<Int>()
            for(j in 0..arr2[0].size - 1) {
                var sum = 0
                for(k in 0..arr2.size - 1) {
                    sum += arr1[i][k] * arr2[k][j]
                }
                temp.add(sum)
            }
            answer.add(temp.toIntArray())
        }
        
        return answer
    }
}