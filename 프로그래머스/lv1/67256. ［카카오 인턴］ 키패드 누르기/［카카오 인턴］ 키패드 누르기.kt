class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        var leftPo = listOf(4,1)
        var rightPo = listOf(4,3)
        
        for(i in numbers) {
            if(i % 3 == 1) {
                answer += "L"
                leftPo = listOf(i / 3 + 1, 1)
            } else if(i != 0 && i % 3 == 0) {
                answer += "R"
                rightPo = listOf(i / 3, 3)
            } else {
                val midPo = if(i != 0) listOf(i / 3 + 1, 2) else listOf(4, 2)  
                
                val leftDiff = Math.abs(leftPo.first() - midPo.first()) + Math.abs(leftPo.last() - midPo.last())
                val rightDiff = Math.abs(rightPo.first() - midPo.first()) + Math.abs(rightPo.last() - midPo.last())

                if(leftDiff > rightDiff) {
                    answer += "R" 
                    rightPo = midPo
                } else if(leftDiff < rightDiff) {
                    answer += "L" 
                    leftPo = midPo
                } else {
                    if(hand == "left") {
                        answer += "L"
                        leftPo = midPo
                    } else {
                        answer += "R"
                        rightPo = midPo
                    }
                }
            }
        }
        
        return answer
    }
}