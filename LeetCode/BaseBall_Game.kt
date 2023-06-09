class BaseBall_Game {
	fun calPoints(operations: Array<String>): Int {
        val stack = Stack<Int>()
        for(item in operations){
            when(item){
                "+"->{
                   val x=stack.pop()
                   val y=stack.pop()
                  stack.push(y)
                  stack.push(x)
                    stack.push(x+y)
                }
                "D"->{
                    val x=stack.peek()
                    stack.push(x*2)
                }
                "C"->{
                    stack.pop()
                }
                else->stack.push(item.toInt())
            }

        }
        return stack.sumBy { it }
    }
}