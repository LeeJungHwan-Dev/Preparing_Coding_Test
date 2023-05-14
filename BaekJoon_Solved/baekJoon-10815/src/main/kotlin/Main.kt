fun main(args: Array<String>) {
    var size = readln().toInt()
    var str = StringBuilder()
    var list = HashMap<Int,Int>()

    readln().split(" ").forEach{
        list[it.toInt()] = list.getOrDefault(it.toInt(),0) + 1
    }

    var size2 = readln().toInt()

    readln().split(" ").forEach {
        str.append(list.getOrDefault(it.toInt(),0)).append(" ")
    }

    println(str)
}