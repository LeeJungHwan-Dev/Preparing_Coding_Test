import java.util.*

fun main(args: Array<String>) {
    var count = readln().toInt()
    var que = PriorityQueue<Int>()

    repeat(count){
        var line = readln().toInt()

        if (line == 0){
            if (que.isNotEmpty()){
                println(que.poll())
            }else{
                println(0)
            }
        }else{
            que.add(line)
        }

    }

}