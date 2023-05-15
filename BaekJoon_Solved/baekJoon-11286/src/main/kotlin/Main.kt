import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {
    var que = PriorityQueue(Comparator<Int>{a,b ->
        when (abs(a)) {
            abs(b) -> a-b
            else -> abs(a)-abs(b)
        }
    })
    var count = readln().toInt()

    repeat(count){
        var line = readln().toInt()

        if (line != 0){
            que.add(line)
        }else{
            if (que.size != 0){
                println(que.poll())
            }else{
                println(0)
            }
        }
    }


}