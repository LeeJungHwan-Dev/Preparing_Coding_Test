import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val count : Int = readln().toInt()
    val list : List<String> = readln()!!.split(" ").toList()
    var numList : ArrayList<Int> = ArrayList()

    for(i in 0 until  count){
        numList.add(i, list[i].toInt())
    }

    print("${numList.min()} ${numList.max()}")
}