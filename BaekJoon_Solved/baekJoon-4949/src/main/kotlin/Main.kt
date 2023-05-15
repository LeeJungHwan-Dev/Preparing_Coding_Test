import java.util.*

fun main(args: Array<String>) {

    while (true) {
        var stack = Stack<Char>()
        var line = readln()

        if(line == "."){
            break
        }else {
            line.forEach {
                if (it == '(' || it == '[' || stack.isEmpty() && it == ')' || stack.isEmpty() && it == ']') {
                    stack.push(it)
                } else if (stack.isNotEmpty()&&it == ')') {
                    if (stack.peek() == '(') {
                        stack.pop()
                    }else{
                        stack.push(')') // 사실상 해당 코드가 추가되면 No가 출력된다.
                    }
                } else if (stack.isNotEmpty()&&it == ']') {
                    if (stack.peek() == '[') {
                        stack.pop()
                    }else{
                        stack.push(')')
                    }
                }
            }

            if (stack.isEmpty()){
                println("yes")
            }else{
                println("no")
            }

        }
    }

}