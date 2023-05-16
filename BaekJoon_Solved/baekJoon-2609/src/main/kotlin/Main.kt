import kotlin.math.max

fun main(args: Array<String>) {
    var numList = readln().split(" ").map { it.toInt() }
    var max = 0

    for (i in 1 .. max(numList[0],numList[1])){
       if (numList[0] % i == 0 && numList[1] % i == 0){
           max = i
       }
    }

    println(max)
    println(max * numList[0] / max * numList[1] / max)
}