import java.util.PriorityQueue

fun main(args: Array<String>) {
    var count = readln().toInt()
    var que = PriorityQueue<Int>()
    var cnt = 0

    repeat(count){
        que.add(readln().toInt())
    }

    while (que.isNotEmpty()){
        var num = que.poll()

        if(que.isNotEmpty()){
            var num2 = num + que.poll()
            cnt += num2
            que.add(num2)
        }
    }

    println(cnt)


}