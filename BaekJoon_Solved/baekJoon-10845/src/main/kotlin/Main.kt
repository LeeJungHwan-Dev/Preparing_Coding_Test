import java.util.LinkedList
import java.util.Queue

fun main(args: Array<String>) {
    var count = readln().toInt()
    var que : Queue<Int> = LinkedList<Int>()

    repeat(count){
        var line = readln().split(" ")

        when(line[0]){
            "push" ->  que.add(line[1].toInt())
            "pop" -> {
                if (que.size > 0){
                    println(que.poll())
                }else{
                    println(-1)
                }
            }
            "size" -> println(que.size)
            "empty" -> {
                if(que.size <= 0){
                    println(1)
                }else{
                    println(0)
                }
            }
            "front" -> {
                if (que.size > 0){
                    println(que.peek())
                }else{
                    println(-1)
                }
            }
            "back" -> {
                if (que.size > 0){
                    println(que.last())
                }else{
                    println(-1)
                }
            }
        }

    }


}