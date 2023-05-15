import java.util.*

fun main(args: Array<String>) {
    var comp = Comparator.reverseOrder<Int>()
    var que = PriorityQueue(comp)
    var sc = System.`in`.bufferedReader()
    var count = sc.readLine().toInt()
    var str = StringBuilder()

    repeat(count){
        var line = sc.readLine().toInt()

        if (line == 0){
            if (que.size != 0){
                str.append(que.poll()).append("\n")
            }else{
                str.append(0).append("\n")
            }
        }else{
            que.add(line)
        }
    }

    println(str)
    sc.close()

}