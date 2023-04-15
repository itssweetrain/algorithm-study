import java.util.Stack

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var strArr = arrayListOf<String>()
        
        fun stackEle(arr: ArrayList<String>): Boolean {
           val stack = Stack<String>()
           for(i in arr) {
                val s = i.toString()
                if(s == "[" || s == "{" || s == "(") {
                    stack.push(s)
                } else {
                    if(!stack.isEmpty()) {
                        when(s) {
                            "]" -> if(stack.peek() == "[") stack.pop()
                            "}" -> if(stack.peek() == "{") stack.pop() 
                            ")" -> if(stack.peek() == "(") stack.pop() 
                            else -> stack.push(s)
                        }
                    } else {
                        stack.push(s)
                    }
                }
            }
           return stack.isEmpty()
        }

       for(i in s) { 
           strArr.add(i.toString()) 
        }
        
       for(i in s) {
           if(stackEle(strArr)) {
                answer ++
            }
            strArr.add(strArr[0].toString())   
            strArr.removeAt(0)
        }     
         
        return answer
    }
}