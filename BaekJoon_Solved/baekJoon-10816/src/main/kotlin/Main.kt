import java.util.StringTokenizer

fun main(args: Array<String>) {
    var size = readln().toInt()
    var map = HashMap<Int,Int>()
    var stringBuilder = StringBuilder()


    readln().split(" ").forEach{
       map[it.toInt()] = map.getOrDefault(it.toInt(),0) + 1
    }

    var size2 = readln().toInt()

    readln().split(" ").forEach {
       stringBuilder.append("${map.getOrDefault(it.toInt(),0)} ")
    }

    println(stringBuilder)

}